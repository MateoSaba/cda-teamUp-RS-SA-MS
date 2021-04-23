import React, { Component } from 'react';
import '../assets/css/CreerMatch.css'
import '../assets/css/pagecontent.css'

class AjouterJoueur extends Component {
    render() {
        return (
            <div className="wrapper page-content">
                  <h1 className="titre-profil">Ajouter un joueur</h1>
                <div id="formContent">
                    <form>
                        <h1 className="mt-3 mb-3 titre-info">Informations</h1>
                        <input type="text" id="prenom" class=" third mb-3" name="prenom" placeholder="Prenom" />
                        <input type="text" id="nom" class=" second" name="nom" placeholder="Nom" />
                        <input type="text" id="password" class=" second" name="password" placeholder="Mot de passe" />
                        <input type="submit" class=" fourth" value="Sauvegarder" />
                    </form>


                </div>
            </div>
        );
    }
}

export default AjouterJoueur;