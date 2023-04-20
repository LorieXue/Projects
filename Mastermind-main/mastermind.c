#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#include "mastermind.h"

#define TAB_FACILE 4
#define TAB_MOYEN 6
#define TAB_DIFFICILE 8


void affiche_menu(){

printf("\tMASTERMIND\n");
printf("\t1- Facile\n");
printf("\t2- Moyen\n");
printf("\t3- Difficile\n");
printf("\t4- Quitter\n");

}

int saisie_min_max(int min, int max){
int saisie;
scanf("%d",&saisie);
	while ((saisie>max)||(saisie<min)) {
		printf("Non valide, reessayez.\n");
		scanf("%d",&saisie);

	}
	return saisie;
}

int menu(int* T_tab){
	affiche_menu();
	printf(" > ");
	int saisie=saisie_min_max(1,4);
	
	
	 if (saisie<4) {
	 	if (saisie==1) {
	 		*T_tab = TAB_FACILE;
	 	}
	 	if (saisie==2){
	 		*T_tab = TAB_MOYEN;
	 	}
	 	if (saisie==3){
	 		*T_tab = TAB_DIFFICILE;
	 	}
	 }
	return saisie;
}


int* init_ligne_jeu(int niveau){
		
	int* tab=malloc(niveau*sizeof(int));
		
	int i;	
	for (i=0;i<niveau;i++)
		tab[i]=0;
		
	return tab;
}

void affiche_ligne(int* ligne,int taille) {
	int i;
	printf("\t|");
	for(i=0;i<taille;i++) {
	if (ligne[i]==0) {
		printf("_ ");
		continue;
	}
	printf("%d ",ligne[i]); }
	printf("|");

}


int* saisie_joueur(int niveau, int* cpt) {
	int saisie;
	int* saisie_joueur=init_ligne_jeu(niveau);
	printf("\t\t");
	int i;
	for (i=0;i<niveau;i++){
		printf("\t");
		saisie = saisie_min_max( -1, niveau);
		saisie_joueur[i] = saisie;
		if (saisie==-1) {
			return saisie_joueur;
		}
		printf("\n");
		affiche_ligne(saisie_joueur,niveau);
		
	}
	
	*cpt=*cpt+1;
	return saisie_joueur;

}


int* soluce_alea(int niveau){
int* soluce = init_ligne_jeu(niveau);
	int* r_tab = init_ligne_jeu(niveau);
	int r = rand()%niveau+1;
	int r2 = r;

	soluce[0] = r;
	r_tab[0] = r2;

	int i=0;
	int j;
	for(j=1;j<niveau;j++){
	r = rand()%niveau+1;
	r2 = r;
	while(r_tab[i]!=0){
		if (r == r_tab[i]) {
			r = rand()%niveau+1;
			r2 = r;
			i=-1;
		}
		i++;
	}
	soluce[j] = r;
	r_tab[i] = r2;
	i=0;
	}
	
	if (niveau==TAB_MOYEN) {
		soluce[rand()%niveau] = 0;
		if (rand()%6+1 == 1) {
			soluce[(rand()%niveau)] = 0;
		}
	}
	
	if (niveau == TAB_DIFFICILE) {
		int ind;
		for (ind=0;ind<3;ind++){
			if (rand()%5+1 == 1) {
			r = soluce[rand()%niveau];
			soluce[rand()%niveau] = r;
			}
		}
		soluce[rand()%niveau] = 0;
		if (rand()%5+1 == 1) {
			soluce[rand()%niveau] = 0;
		}	
	
	
	}
	
	free(r_tab);

	return soluce;
}

int compte_n_int (int* tab, int taille,int n){
	int cpt = 0;

	int i;
	for(i=0;i<taille;i++) {
		if (tab[i]==n) cpt++;

	}

	return cpt;

}


int verif(int* soluce, int* saisie_joueur, int niveau) {
	
	int oui =0;
	int i,j;
	int skip = 0;
	char* AB= malloc(niveau*sizeof(char));
	int cpt_joueur = 0;
	int cpt_sol = 0;
	printf("\n\t");
	for(i=0;i<niveau;i++) {
		cpt_joueur = compte_n_int(saisie_joueur,niveau,soluce[i]);
		cpt_sol = compte_n_int(soluce,niveau,soluce[i]);
		
		if (soluce[i] == saisie_joueur[i]) {
			oui++;
			AB[i]='A';
			continue;
		}

		for (j=0;j<niveau;j++){
			if (saisie_joueur[j]==-1) {
				return -1;
			}
			if (soluce[i] == saisie_joueur[j]) {
				if (cpt_joueur==cpt_sol){
					AB[j]='B';
					break;
				}
			
				if ((cpt_joueur>cpt_sol)&&(skip<cpt_sol)){
					skip++;
					AB[j]='B';
				} 

			}
		}
		skip=0;
	}

	int ind;
	for(ind=0;ind<niveau;ind++){
		if ((AB[ind]=='A')||(AB[ind]=='B')){
			printf(" %c",AB[ind]);
		}

	}	
	
	free(AB);
	
	if (oui==niveau)  {
		return 1;
	}
	
	return 0;

}


void mastermind() {
	srand(time(NULL));
	int niveau=0;
	int saisie = menu(&niveau);
		if (saisie<4){
			printf("\t  MASTERMIND\n\n");	
			int cpt=0;
			int* ligne_joueur;
			int* soluce = soluce_alea(niveau);
			int AB = 0;
			
			/*affiche_ligne(soluce,niveau);*/
			while ((AB!=1)&&(AB!=-1)) {
			
				ligne_joueur = saisie_joueur(niveau,&cpt);
				AB = verif(soluce,ligne_joueur,niveau);
				printf("\n");
			
			}
		
		printf("\n\n\t Reponse :\n\n"); 
		affiche_ligne(soluce,niveau);printf("\n");

		if (AB==-1) {
			printf("\n\tDommage... :( Vous avez decide d'abandonner.\n\tNombre de coups actuel : %d \n",cpt);
		}
		else {
			printf("\n\tBRAVO ! :) Vous avez reussi.\n\tNombre de coups total : %d\n",cpt);
		}

		printf("\n\tVoulez-vous y rejouer ?\n");
		printf("\t1- OUI\t2- NON\n");
		
		printf(" > ");
		saisie = saisie_min_max(1,2);
		
		free(ligne_joueur);
		free(soluce);
		
		if (saisie==1) {

			mastermind();
		
		}
		
	}
	
}


int main(){
	
	mastermind();
	
	return 0;

}
