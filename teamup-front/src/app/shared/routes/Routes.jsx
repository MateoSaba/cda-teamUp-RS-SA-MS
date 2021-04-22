import React, { Component } from 'react';
import { Route, Switch } from 'react-router';
import {createBrowserHistory} from 'history';
import {URL_HOMECONNEXION, URL_HISTORIQUE, URL_STATISTIQUE, URL_PROFIL,URL_PARTICIPER,URL_AJOUTER,URL_LISTE,URL_CREER } from '../constants/URL_CONST.js';
import HomeConnexion from '../../views/HomeConnexion.jsx';
import Historique from '../../views/Historique.jsx';
import Statistique from '../../views/Statistique.jsx';
import Profil from '../../views/Profil.jsx';
import Participer from '../../views/Participer.jsx';
import AjouterJoueur from '../../views/AjouterJoueur.jsx'
import CreerMatch from '../../views/CreerMatch.jsx'
import ListeJoueur from '../../views/AjouterJoueur.jsx'

const CustomHistory = createBrowserHistory()

class Routes extends Component {
    render() {
        return (
            <>
                    <Switch history={CustomHistory}>
                        <Route exact path={URL_HOMECONNEXION} component={HomeConnexion}></Route>
                        <Route exact path={URL_HISTORIQUE} component={Historique}></Route>
                        <Route path={URL_STATISTIQUE} component={Statistique}></Route>
                        <Route path={URL_PROFIL} component={Profil}></Route>
                        <Route path={URL_PARTICIPER} component={Participer}></Route>
                        <Route path={URL_AJOUTER} component={AjouterJoueur}></Route>
                        <Route path={URL_CREER} component={CreerMatch}></Route>
                        <Route path={URL_LISTE} component={ListeJoueur}></Route>
                    </Switch>
            </>
        );
    }
}

export default Routes;