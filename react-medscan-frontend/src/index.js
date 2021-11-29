import React from 'react';
import ReactDOM from 'react-dom';
import registerServiceWorker from './registerServiceWorker';
import { MedscanContainer } from './componentes/MedscanContainer';

ReactDOM.render(
    <MedscanContainer />, 
    document.getElementById('root')
);

registerServiceWorker();
