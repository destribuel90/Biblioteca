-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-01-2025 a las 23:30:15
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `library`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `publication_year` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `isbn` varchar(20) DEFAULT NULL,
  `copies` int(11) DEFAULT NULL,
  `description` text DEFAULT NULL,
  `status` enum('available','borrowed') DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `supplier_id` int(11) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id`, `title`, `author`, `publisher`, `publication_year`, `category_id`, `isbn`, `copies`, `description`, `status`, `price`, `supplier_id`, `image`) VALUES
(3, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Scribner', 1925, 1, '9780743273565', 10, 'A novel set in the Jazz Age that explores themes of wealth and the American Dream.', 'available', '20', 1, NULL),
(4, 'A Brief History of Time', 'Stephen Hawking', 'Bantam', 1988, 2, '9780553380163', 5, 'An exploration of the universe by the renowned physicist.', 'available', '25', 2, NULL),
(5, 'Sapiens', 'Yuval Noah Harari', 'Harper', 2011, 3, '9780062316097', 8, 'A history of humankind from the Stone Age to the modern era.', 'available', '30', 3, NULL),
(6, 'Clean Code', 'Robert C. Martin', 'Prentice Hall', 2008, 4, '9780132350884', 15, 'A guide to writing cleaner, more maintainable code.', 'available', '35', 4, NULL),
(7, 'Meditations', 'Marcus Aurelius', 'Penguin Classics', 0, 5, '9780140449334', 12, 'Reflections and philosophies of the Roman Emperor.', 'available', '15', 5, NULL),
(8, '1984', 'George Orwell', 'Secker & Warburg', 1949, 1, '9780451524935', 20, 'A dystopian novel about totalitarianism and surveillance.', 'borrowed', '18', 6, NULL),
(9, 'The Selfish Gene', 'Richard Dawkins', 'Oxford University Press', 1976, 2, '9780192860927', 6, 'A groundbreaking book on evolutionary biology.', 'available', '22', 7, NULL),
(10, 'The Art of War', 'Sun Tzu', 'Oxford University Press', 0, 5, '9780195014763', 5, 'An ancient treatise on military strategy and tactics.', 'available', '10', 8, NULL),
(11, 'The Innovators', 'Walter Isaacson', 'Simon & Schuster', 2014, 4, '9781476708706', 3, 'A history of the people who created the computer and the internet.', 'available', '22', 9, NULL),
(12, 'The Rise and Fall of the Third Reich', 'William L. Shirer', 'Simon & Schuster', 1960, 3, '9780671728687', 3, 'A detailed history of Nazi Germany.', 'available', '10', 10, NULL),
(13, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Scribner', 1925, 1, '9780743273565', 9, 'A novel set in the Jazz Age that explores themes of wealth and the American Dream.', 'available', '28', 1, NULL),
(14, 'A Brief History of Time', 'Stephen Hawking', 'Bantam', 1988, 2, '9780553380163', 6, 'An exploration of the universe by the renowned physicist.', 'available', '32', 2, NULL),
(15, 'Sapiens', 'Yuval Noah Harari', 'Harper', 2011, 3, '9780062316097', 8, 'A history of humankind from the Stone Age to the modern era.', 'available', '40', 3, NULL),
(16, 'Clean Code', 'Robert C. Martin', 'Prentice Hall', 2008, 4, '9780132350884', 15, 'A guide to writing cleaner, more maintainable code.', 'available', '30', 4, NULL),
(17, 'Meditations', 'Marcus Aurelius', 'Penguin Classics', 180, 5, '9780140449334', 12, 'Reflections and philosophies of the Roman Emperor.', 'available', '35', 5, NULL),
(18, '1984', 'George Orwell', 'Secker & Warburg', 1949, 1, '9780451524935', 20, 'A dystopian novel about totalitarianism and surveillance.', 'borrowed', '20', 6, NULL),
(19, 'The Selfish Gene', 'Richard Dawkins', 'Oxford University Press', 1976, 2, '9780192860927', 7, 'A groundbreaking book on evolutionary biology.', 'available', '12', 7, NULL),
(20, 'The Art of War', 'Sun Tzu', 'Oxford University Press', -500, 5, '9780195014763', 6, 'An ancient treatise on military strategy and tactics.', 'available', '11', 8, NULL),
(21, 'The Innovators', 'Walter Isaacson', 'Simon & Schuster', 2014, 4, '9781476708706', 4, 'A history of the people who created the computer and the internet.', 'available', '12', 9, NULL),
(22, 'The Rise and Fall of the Third Reich', 'William L. Shirer', 'Simon & Schuster', 1960, 3, '9780671728687', 3, 'A detailed history of Nazi Germany.', 'available', '45', 10, NULL),
(23, 'The Art of War', 'Sun Tzu', 'Éxodo prueba', 2000, 3, '9780553380163', 1, 'Esto es una prueba, registro de prueba.', 'available', '34', 1, NULL),
(24, 'Cálculo Diferencial e Integral', 'Velia Margarita Calzada Gaóna', 'Éxodo', 2024, 2, '9780062316099', 0, 'Un excelente libro para estudiar y dominar el cálculo diferencial e integral.', 'available', '40', 2, NULL),
(25, 'Editado', 'El Editado', 'Los editados', 2000, 1, '9780140449332', 10, 'Este es un libro editado por un administrador.', 'available', '22', 1, 'C:\\Users\\user\\OneDrive\\Documentos\\NetBeansProjects\\Biblioteca\\Images\\41c77554-897f-4d37-ab8d-da72ccc3c89c.jpg'),
(26, 'sdfsdf', 'dsfsdfds', 'sdfsd', 2000, 1, '9780140449332', 10, 'sfsadfsadfasd', 'available', '22', 2, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `branch`
--

CREATE TABLE `branch` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `manager_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `category`
--

INSERT INTO `category` (`id`, `name`, `description`) VALUES
(1, 'Fiction', 'Books that contain fictional stories and narratives.'),
(2, 'Science', 'Books focused on scientific topics and research.'),
(3, 'History', 'Books that explore historical events and figures.'),
(4, 'Technology', 'Books covering technological advancements and topics.'),
(5, 'Philosophy', 'Books on philosophical concepts and theories.'),
(6, 'Self Improvement', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libraryuser`
--

CREATE TABLE `libraryuser` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` enum('admin','user') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libraryuser`
--

INSERT INTO `libraryuser` (`id`, `name`, `email`, `password`, `role`) VALUES
(1, 'Emilio', 'emilio@gmail.com', '123', 'admin'),
(2, 'Admin', 'admin@gmail.com', 'admin', 'admin'),
(5, 'ksl', 'ksl@gmail.com', 'ksl', 'user');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `loan`
--

CREATE TABLE `loan` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  `loan_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `status` enum('active','returned','overdue') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `loan`
--

INSERT INTO `loan` (`id`, `user_id`, `book_id`, `loan_date`, `return_date`, `status`) VALUES
(1, 1, 13, '2024-12-28', NULL, 'returned'),
(2, 1, 10, '2024-12-28', '2025-01-11', 'returned');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `purchase`
--

CREATE TABLE `purchase` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `supplier_id` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  `purchase_date` date DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `cost_per_unit` decimal(10,2) DEFAULT NULL,
  `total_cost` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `purchase`
--

INSERT INTO `purchase` (`id`, `user_id`, `supplier_id`, `book_id`, `purchase_date`, `quantity`, `cost_per_unit`, `total_cost`) VALUES
(2, NULL, 1, 14, '2024-12-28', 1, 32.00, 32.00),
(3, 1, 7, 9, '2024-12-28', 1, 22.00, 22.00),
(4, 1, 2, 24, '2024-12-28', 1, 40.00, 40.00),
(5, 1, 9, 11, '2024-12-30', 1, 22.00, 22.00),
(6, 5, 1, 23, '2025-01-02', 1, 34.00, 34.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `review`
--

CREATE TABLE `review` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `comment` text DEFAULT NULL,
  `review_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `review`
--

INSERT INTO `review` (`id`, `user_id`, `book_id`, `rating`, `comment`, `review_date`) VALUES
(5, 1, 24, 10, '¡!Excelente, gracias a este libro soy un experto en cálculo diferencial a integral!', '2024-12-30'),
(6, 1, 9, 10, 'Un libro muy interesante', '2024-12-30'),
(7, 1, 11, 10, '¡Gúau, cuanta tecnología!', '2024-12-30');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `supplier`
--

CREATE TABLE `supplier` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `contact_name` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `supplier`
--

INSERT INTO `supplier` (`id`, `name`, `contact_name`, `phone`, `email`, `address`) VALUES
(1, 'TechBooks Co.', 'John Smith', '123-456-7890', 'contact@techbooks.com', '123 Technology Lane, Silicon Valley, CA'),
(2, 'EduResources Inc.', 'Mary Johnson', '987-654-3210', 'info@eduresources.com', '456 Education Ave, Boston, MA'),
(3, 'Literary World', 'Emily Davis', '555-123-4567', 'support@literaryworld.com', '789 Fiction St, New York, NY'),
(4, 'Knowledge Distributors', 'James Brown', '222-333-4444', 'sales@knowledgedist.com', '101 Knowledge Blvd, Chicago, IL'),
(5, 'Global Prints', 'Linda Wilson', '888-777-6666', 'globalprints@booksupply.com', '202 Printing Way, Seattle, WA'),
(6, 'Classic Books Ltd.', 'Robert Martinez', '111-222-3333', 'classics@classicbooks.com', '303 Classics Ave, San Francisco, CA'),
(7, 'Science Horizons', 'Patricia Garcia', '444-555-6666', 'contact@sciencehorizons.com', '404 Science Parkway, Houston, TX'),
(8, 'History Unlimited', 'Michael Anderson', '666-555-4444', 'history@historyunltd.com', '505 Historic Dr, Philadelphia, PA'),
(9, 'Digital Books', 'Barbara Thomas', '777-888-9999', 'digital@digitalbooks.com', '606 Digital Lane, Austin, TX'),
(10, 'Modern Learning', 'William Rodriguez', '999-888-7777', 'learn@modernlearning.com', '707 Learning Rd, Denver, CO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`),
  ADD KEY `category_id` (`category_id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Indices de la tabla `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`id`),
  ADD KEY `manager_id` (`manager_id`);

--
-- Indices de la tabla `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Indices de la tabla `libraryuser`
--
ALTER TABLE `libraryuser`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indices de la tabla `loan`
--
ALTER TABLE `loan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `book_id` (`book_id`);

--
-- Indices de la tabla `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`id`),
  ADD KEY `supplier_id` (`supplier_id`),
  ADD KEY `book_id` (`book_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indices de la tabla `review`
--
ALTER TABLE `review`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `book_id` (`book_id`);

--
-- Indices de la tabla `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `book`
--
ALTER TABLE `book`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `branch`
--
ALTER TABLE `branch`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `libraryuser`
--
ALTER TABLE `libraryuser`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `loan`
--
ALTER TABLE `loan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `purchase`
--
ALTER TABLE `purchase`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `review`
--
ALTER TABLE `review`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  ADD CONSTRAINT `book_ibfk_2` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`);

--
-- Filtros para la tabla `branch`
--
ALTER TABLE `branch`
  ADD CONSTRAINT `branch_ibfk_1` FOREIGN KEY (`manager_id`) REFERENCES `libraryuser` (`id`);

--
-- Filtros para la tabla `loan`
--
ALTER TABLE `loan`
  ADD CONSTRAINT `loan_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `libraryuser` (`id`),
  ADD CONSTRAINT `loan_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);

--
-- Filtros para la tabla `purchase`
--
ALTER TABLE `purchase`
  ADD CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`),
  ADD CONSTRAINT `purchase_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`),
  ADD CONSTRAINT `purchase_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `libraryuser` (`id`);

--
-- Filtros para la tabla `review`
--
ALTER TABLE `review`
  ADD CONSTRAINT `review_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `libraryuser` (`id`),
  ADD CONSTRAINT `review_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
