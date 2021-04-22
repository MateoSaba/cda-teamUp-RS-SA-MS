import React, { Component } from 'react';
import '../../assets/css/NavBar.css'

import { NavLink } from 'react-router-dom';
import {URL_HISTORIQUE, URL_STATISTIQUE, URL_PROFIL,URL_PARTICIPER  } from '../../shared/constants/URL_CONST.js';
import '../../assets/js/navbar.js'
class NavBar extends Component {

  render() {

    return (
   /*    <div>
<div class="sidebar-container shadow-sm bg-white rounded">
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
    <NavLink to={URL_PARTICIPER} className="nav-link " activeClassName="font-weight-bold">  <i class="fa fa-futbol" aria-hidden="true"></i> Participer</NavLink>
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


       */

<div>
<div class="vertical-nav bg-white" id="sidebar">
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
    <NavLink to={URL_PARTICIPER} className="nav-link " activeClassName="font-weight-bold">  <i class="fa fa-futbol" aria-hidden="true"></i> Participer</NavLink>
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


<div class="page-content p-5" id="content">
  <button id="sidebarCollapse" type="button" class="btn btn-light bg-white rounded-pill shadow-sm px-4 mb-4"><i class="fa fa-bars "></i><small class="text-uppercase font-weight-bold"></small></button>


</div>
</div>

    );

  }

}



export default NavBar;