import React, { Component } from 'react';
import '../../assets/css/NavBar.css'
import { NavLink } from 'react-router-dom';
import {URL_HISTORIQUE, URL_STATISTIQUE, URL_PROFIL } from '../../shared/constants/URL_CONST.js';




class NavBar extends Component {

  render() {

    return (
      <div>
<div class="sidebar-container">
  <div class="sidebar-logo ">
    Team Up
  </div>
  <ul class="sidebar-navigation">
    
    <li>
      <NavLink to={URL_PROFIL} className="nav-link " activeClassName="font-weight-bold"><i class="fa fa-home" aria-hidden="true"></i> Profil</NavLink>
    </li>
    <li>

      <NavLink to={URL_HISTORIQUE} className="nav-link " activeClassName="font-weight-bold"><i class="fa fa-history" aria-hidden="true"></i> Historique</NavLink>

    </li>
    <li>
      <NavLink to={URL_STATISTIQUE} className="nav-link " activeClassName="font-weight-bold">  <i class="fa fa-chart-line" aria-hidden="true"></i> Statistiques</NavLink>
    </li>
    <li className="menu-admin">
      <a href="lol">
        <i class="fa fa-futbol" aria-hidden="true"></i> Participer
      </a>
    </li>
    <li class="header">ADMIN</li>
    <li>
      <a href="lol">
        <i class="fa fa-users" aria-hidden="true"></i> Creer un match
      </a>
    </li>
    <li>
      <a href="lol">
        <i class="fa fa-cog" aria-hidden="true"></i> Ajouter un user
      </a>
    </li>
  
  </ul>
</div>


</div>
      
    );

  }

}



export default NavBar;