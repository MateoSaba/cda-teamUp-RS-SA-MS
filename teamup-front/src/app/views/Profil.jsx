import React, { Component } from 'react';
import '../assets/css/profil.css'
import '../assets/css/pagecontent.css'
import '../assets/js/imageUpload.js'

class Profil extends Component {
    render() {
        return (
            <div className="wrapper page-content">
                <div id="formContent">
                    <form>
                        <h1 className="mt-3 mb-3">Modifier mon profil</h1>
                        <input type="text" id="password" class=" third mb-3" name="prenom" placeholder="Prenom" />
                        <input type="text" id="login" class=" second" name="nom" placeholder="Nom" />
                        <div class="form-group mb-4">
                            <label for="exampleFormControlSelect1" className='tests'>poste préféré</label>
                            <select class="form-control formulaire" id="exampleFormControlSelect1">
                                <option>Attaquant</option>
                                <option>Milieu</option>
                                <option>Défenseur</option>
                                <option>Gardien</option>
                            </select>
                        </div>

                        <div class="input-group-append second image">
                            <label for="upload" class="btn btn-light m-0 rounded-pill px-4 boutonimage"> <i class="fa fa-cloud-upload mr-2 text-muted"></i><small class="text-uppercase font-weight-bold text-muted">Modifier photo de profil</small></label>
                        </div>

                        <input type="submit" class=" fourth" value="Sauvegarder" />
                    </form>


                </div>
            </div>
        );
    }
}

export default Profil;