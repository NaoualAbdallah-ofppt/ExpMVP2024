package aa.bb.expmvp.view;

import aa.bb.expmvp.model.Animal;

public class AnimalPresenter {
AnimalView view;

    public AnimalPresenter(AnimalView view) {
        this.view = view;
    }
private Animal getAnimalByNum(int num)
{
    for (Animal a: Animal.getAnimals()){
        if (a.getNum()==num)
            return a;
    }
    return null;
}
    public void recupDataByNum(int num){
        view.onGetName(getAnimalByNum(num).getNom());
        view.onGetPrix(getAnimalByNum(num).getPrix());

    }

}
