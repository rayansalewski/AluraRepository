const criaJogo = () => {

	let palavraSecreta = '';
	let lacunas = [];
	let etapa = 1;

	const processaChute = chute => {

		if(!chute.trim()) throw Error ('Chute Inválido');
		var exp = new RegExp(chute, 'gi'),
			resultado,
			acertou = false;

		while(resuldado = exp.exec(palavraSecreta)){

			acertou = lacunas[resuldado.index] = chute;
		}	
		
		if(!acertou) sprite.nextFrame();

	};

	const criaLacunas = () => {
		
		lacunas = Array(palavraSecreta.length).fill('');
		// for (var i = 0; i < palavraSecreta.length; i++) {
		// 	lacunas.push('');
		// }
	};

	const proximaEtapa = etapas => etapa = etapas;

	const setPalavraSecreta = palavra => {
		
		if(!palavra.trim()) throw Error('Palavra secreta inválida');
		palavraSecreta = palavra
		criaLacunas();
		proximaEtapa(2);
	};

	const getLacunas = () => lacunas;

	const getEtapa = () => etapa;

	const ganhou = () =>  lacunas.length 
        	? !lacunas.some(function(lacuna){
        	return lacuna == '';
        })
        : false;

    const perdeu = () => sprite.isFinished();

    const ganhouOuPerdeu = () => ganhou() || perdeu();

    const reinicia = () => {
      
        etapa = 1;
        lacunas = [];
        palavraSecreta = '';
        sprite.reset();
    };

    // adicionou novas propriedades
    return {
      	setPalavraSecreta,
        getLacunas,
        getEtapa,
        processaChute,
        ganhou,
        perdeu,
        ganhouOuPerdeu, 
        reinicia
    }
};