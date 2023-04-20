
#define TAB_FACILE 4
#define TAB_MOYEN 6
#define TAB_DIFFICILE 8

void affiche_menu();


int saisie_min_max(int min, int max);


int menu(int* T_tab);

int* init_ligne_jeu(int taille);

void affiche_ligne(int* ligne,int taille);


int* soluce_alea(int niveau);

int* saisie_joueur(int niveau,int* cpt);

int  verif(int* soluce, int* saisie_joueur, int niveau);



void mastermind();

