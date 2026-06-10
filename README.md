# PDF Chatbot (Question Answering over PDF Documents)

## Overview
This project is a simple PDF-based chatbot that allows users to upload a PDF document and ask questions about its contents.

The chatbot:
- Extracts text from a PDF file
- Splits the content into manageable chunks
- Finds the most relevant section for a user's question
- Generates answers directly from the PDF content
- Provides a Gradio web interface for interaction
- Optionally supports OpenAI API fallback when information is not found in the PDF

---

## Features

### PDF Processing
- Reads PDF files using PyPDF2
- Extracts text from all pages
- Cleans and organizes text for searching

### Information Retrieval
- Splits large documents into chunks
- Uses keyword matching to find relevant content
- Extracts related sentences from the best matching section

### Question Answering
- Answers questions using PDF content
- Returns relevant passages from the document
- Can optionally use OpenAI API for fallback responses

### User Interface
- Built with Gradio
- Simple chat-style interaction
- Upload a PDF and start asking questions

---

## Technologies Used

- Python
- PyPDF2
- OpenAI API
- Gradio
- Regular Expressions (re)

---

## Installation

Install the required packages:

```bash
pip install PyPDF2 requests openai gradio
```

---

## Project Workflow

1. Upload a PDF document.
2. Extract text from the PDF.
3. Split text into chunks.
4. User asks a question.
5. System finds the most relevant chunk.
6. Relevant sentences are extracted.
7. Answer is displayed in the chatbot.
8. If enabled, OpenAI API can provide fallback responses.

---

## File Structure

```text
project/
│
├── chatbot.ipynb
├── README.md
└── requirements.txt
```

---

## Future Improvements

- Semantic search using embeddings
- Vector database integration
- Support for multiple PDFs
- Better ranking algorithms
- Conversation memory
- PDF upload directly from the Gradio interface

---

## Example Questions

- What is the main topic of this document?
- Summarize Chapter 1.
- What does the document say about machine learning?
- List the key conclusions.

---

## Author

Gouthami
