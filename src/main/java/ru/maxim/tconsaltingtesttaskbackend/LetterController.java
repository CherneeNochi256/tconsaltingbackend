package ru.maxim.tconsaltingtesttaskbackend;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
public class LetterController {
    private final LetterService letterService;

    @GetMapping("/letters/amount")
    public ResponseEntity<String> lettersAmount(@RequestParam String str) {
        return ResponseEntity.ok(letterService.getAmountOfEachLetter(str));
    }
}
