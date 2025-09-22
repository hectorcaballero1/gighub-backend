# **GigHub**

**Plataforma que conecta bandas/artistas emergentes con quienes necesitan música en vivo**

## **Descripción del Proyecto**

GigHub es una plataforma web que conecta bandas emergentes con cualquier persona que necesite música en vivo: bares, clubes, centros culturales, cumpleaños, bodas, eventos corporativos, etc.

La plataforma permite que los contratantes publiquen sus necesidades con información específica (fecha, horario, tipo de evento, presupuesto), mientras que las bandas pueden explorar estas oportunidades, postularse, y ser seleccionadas.

## **Funcionalidades del Proyecto**

### **1\. Sistema de Registro**

**MVP:**

* Registro simple: "¿Eres músico?" Sí/No
* Si No → Perfil de Contratante
* Si Sí → Perfil de Banda
* Campos básicos: nombre, email, contraseña
* Login con email/contraseña

**Extra:**

* Registro/login con Google
* Verificación de email

### **2\. Perfiles de Usuario**

**MVP \- Perfil de Banda:**

* Foto de perfil
* Foto de portada
* Nombre y descripción de la banda
* Género musical
* 1 link de YouTube (embed del reproductor)
* Información de contacto (email/teléfono)
* Rating promedio (1-5 estrellas)
* Historial/Reseñas: Lista de eventos pasados con rating y comentarios

**MVP \- Perfil de Contratante:**

* Foto de perfil (opcional)
* Nombre
* Descripción (opcional)
* Información de contacto
* Rating promedio
* Historial/Reseñas: Lista de eventos realizados con ratings recibidos

**Extra (Pro) \- Perfil de Banda/Artista:**

* 5 links de videos de YouTube
* Fotos adicionales de la banda
* Información de contacto destacada

**Extra (Pro) \- Perfil de Contratante/Venue:**

* Información detallada del local (si es venue)
* Ubicación específica
* Fotos del espacio/escenario

### **3\. Publicación de Fechas (Solo Contratantes)**

**MVP:**

* Formulario para crear evento:
    * Título del evento
    * Fecha y horario
    * Tipo de evento (bar, cumpleaños, boda, corporativo)
    * Género musical deseado
    * Presupuesto ofrecido
    * Descripción
* Máximo 3 publicaciones al mes (free)

**Extra (Pro):**

* Publicaciones ilimitadas
* Mayor visibilidad automática sobre publicaciones free

### **4\. Sistema de Postulaciones**

**MVP:**

* Bandas/Artistas exploran eventos disponibles
* Filtros básicos: fecha y género musical
* Máximo 5 postulaciones al mes (free)
* Postulación con un clic
* Contratante ve lista de bandas postuladas
* Bandas Pro aparecen primero en la lista
* Contratante selecciona una banda
* Notificación por email a la banda seleccionada

**Extra (Pro \- Banda):**

* Postulaciones ilimitadas
* Notificaciones push de nuevos eventos
* Filtros personalizados para notificaciones:
    * Por distrito/ubicación
    * Por rango de presupuesto
    * Por fechas específicas
* Prioridad en aparecer en postulaciones

### **5\. Sistema de Reseñas**

**MVP:**

* Post-evento, se pueden dejar reseñas mutuas
* Cada reseña incluye:
    * Nombre del evento
    * Fecha del evento
    * Rating (1-5 estrellas)
    * Comentario opcional
* Las reseñas forman el historial de presentaciones/eventos
* Cálculo automático de rating promedio
* Visible en todos los perfiles (free y pro)

### **6\. Sistema de Comunicación**

**MVP:**

* Notificación por email cuando:
    * Banda postula (aviso a contratante)
    * Banda es seleccionada (email invitando a contactar al contratante)
* Información de contacto visible en perfiles

**Extra (Pro):**

* Notificaciones push móviles para todas las acciones
* Notificaciones personalizadas de nuevos eventos según filtros

### **7\. Sistema de Pagos**

**MVP:**

* Los pagos de presentaciones se coordinan directamente entre banda y contratante
* GigHub NO procesa estos pagos

**Extra:**

* Procesamiento de membresías Pro a través de la plataforma

### **8\. Navegación y Búsqueda**

**MVP:**

* Dashboard para bandas (eventos disponibles)
* Dashboard para contratantes (sus publicaciones)
* Búsqueda por género y fecha

## **Modelo de Negocio**

### **Estrategia: Freemium enfocado en usuarios recurrentes**

#### **Versión Gratuita:**

**Contratante Free:**

* 3 publicaciones al mes
* Perfil básico
* Ve todas las postulaciones
* Ideal para: personas con eventos únicos (cumpleaños, bodas)

**Banda Free:**

* 5 postulaciones al mes
* Perfil básico (1 video YouTube)
* Notificaciones por email
* Construcción lenta de reputación

#### **Membresías Pro (Única fuente de ingresos):**

### **Banda Pro \- $15/mes**

* Postulaciones ILIMITADAS
* 5 videos de YouTube en perfil
* Aparece PRIMERO en postulaciones
* Notificaciones push instantáneas
* Notificaciones personalizadas de nuevos eventos (por distrito, presupuesto, fecha)

**Target:** Bandas que buscan activamente presentaciones regulares

### **Contratante/Venue Pro \- $30/mes**

* Publicaciones ILIMITADAS
* Mayor visibilidad automática en sus publicaciones
* Perfil detallado del establecimiento

**Target:** Venues/bares que contratan bandas regularmente

### **¿Por qué funciona este modelo?**

1. **Usuarios ocasionales no pagan:** Una persona organizando el cumpleaños de su hermano usa la versión free sin problemas

2. **Usuarios recurrentes sí pagan:**

    * Venues que necesitan bandas cada semana → Pro
    * Bandas que buscan tocar regularmente → Pro
3. **Las bandas NECESITAN el Pro:** Con solo 5 postulaciones/mes, las bandas activas se quedan cortas rápidamente

