import React, { Component } from 'react';
import { Route, Switch } from 'react-router';
import {createBrowserHistory} from 'history';
import {URL_HOMECONNEXION, URL_HISTORIQUE, URL_STATISTIQUE, URL_PROFIL } from '../constants/URL_CONST.js';
import HomeConnexion from '../../views/HomeConnexion.jsx';
import Historique from '../../views/Historique.jsx';
import Statistique from '../../views/Statistique.jsx';
import Profil from '../../views/Profil.jsx';

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
                    </Switch>
            </>
        );
    }
}

export default Routes;