CREATE DATABASE practica
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

CREATE USER 'usuario_practica'@'localhost'
IDENTIFIED BY 'la_Clave';

GRANT ALL PRIVILEGES ON practica.*
TO 'usuario_practica'@'localhost';

FLUSH PRIVILEGES;

USE practica;


CREATE TABLE suculenta (
    id_suculenta INT AUTO_INCREMENT PRIMARY KEY,
    nombre_comun VARCHAR(100) NOT NULL,
    nombre_cientifico VARCHAR(150),
    familia VARCHAR(100),
    color_principal VARCHAR(50),
    altura_cm DECIMAL(6,2),
    precio_estimado DECIMAL(10,2),
    nivel_riego VARCHAR(50),
    ruta_imagen VARCHAR(500)
);

INSERT INTO suculenta
(nombre_comun, nombre_cientifico, familia, color_principal,
altura_cm, precio_estimado, nivel_riego, ruta_imagen)
VALUES
('Rosa de alabastro', 'Echeveria elegans', 'Crassulaceae',
'Verde', 15, 4500, 'Bajo',
'https://images.unsplash.com/photo-1459411552884-841db9b3cc2a'),

('Planta de jade', 'Crassula ovata', 'Crassulaceae',
'Verde', 30, 6500, 'Moderado',
'https://images.unsplash.com/photo-1509423350716-97f9360b4e09'),

('Haworthia cebra', 'Haworthia fasciata', 'Asphodelaceae',
'Verde oscuro', 12, 5500, 'Bajo',
'https://images.unsplash.com/photo-1501004318641-b39e6451bec6');






