import React, { Component } from 'react';
import '../assets/css/Statistique.css'
import '../assets/css/pagecontent.css'

class Statistique extends Component {
  render() {
    return (

      <div>


        <div className="row page-content">

          <div className="wrapper col-md-4">
            <div id="formContent" className="hauteur">
              <h1  className="mtop">Match joués</h1> <br />
              <h1>10</h1>
            </div>
          </div>

          <div className="wrapper col-md-4">
            <h1 className="titre-profil ">Mes stats</h1>
            <div id="formContent" className="hauteur">
              <h1  className="mtop">Victoire</h1> <br />
              <h1>10</h1>
            </div>
          </div>



          <div className="wrapper col-md-4">
            <div id="formContent" className="hauteur">
              <h1  className="mtop">Défaite</h1> <br />
              <h1>10</h1>
            </div>
          </div>

        </div>

        <div className="row page-content">

          <div className="wrapper col-md-4">
            <div id="formContent" className="hauteur">
              <h1 className="mtop">Buts</h1> <br />
              <h1>10</h1>
            </div>
          </div>

          <div className="wrapper col-md-4">
            <div id="formContent" className="hauteur">
              <h1  className="mtop">Meilleur joueur</h1> <br />
              <h1>10</h1>
            </div>
          </div>


          <div className="wrapper col-md-4">
            <div id="formContent" className="hauteur">
              <h1  className="mtop">Pire joueur</h1> <br />
              <h1>10</h1>
            </div>
          </div>

        </div>
      </div>
    );
  }
}

export default Statistique;