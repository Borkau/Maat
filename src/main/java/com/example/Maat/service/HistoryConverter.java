package com.example.Maat.service;

import com.example.Maat.dto.HistoryDto;
import com.example.Maat.entity.History;
import org.springframework.stereotype.Component;

@Component
public class HistoryConverter {

    public History fromHistoryDtoToHistory(HistoryDto historyDto) {
        History history = new History();
        history.setHisId(historyDto.getHisId());
        history.setBoardId(historyDto.getBoardId());
        history.setTradeDate(historyDto.getTradeDate());
        history.setShortHistoryName(historyDto.getShortHistoryName());
        history.setSecHisId(historyDto.getSecHisId());
        history.setNumTrades(historyDto.getNumTrades());
        history.setValueHis(historyDto.getValueHis());
        history.setHisOpen(historyDto.getHisOpen());
        history.setLowHis(historyDto.getLowHis());
        history.setHighHis(historyDto.getHighHis());
        history.setLegalClosePrice(historyDto.getLegalClosePrice());
        history.setWaPrice(historyDto.getWaPrice());
        history.setCloseHis(historyDto.getCloseHis());
        history.setVolumeHis(historyDto.getVolumeHis());
        history.setMarketPrice2(historyDto.getMarketPrice2());
        history.setMarketPrice3(historyDto.getMarketPrice3());
        history.setAdmittedQuote(historyDto.getAdmittedQuote());
        history.setMarketPrice3TradesValue(historyDto.getMarketPrice3TradesValue());
        history.setAdmittedValue(historyDto.getAdmittedValue());
        return history;
    }

    public HistoryDto fromHistoryToHistoryDto(History history) {
        return HistoryDto.builder()
                .hisId(history.getHisId())
                .boardId(history.getBoardId())
                .tradeDate(history.getTradeDate())
                .shortHistoryName(history.getShortHistoryName())
                .secHisId(history.getSecHisId())
                .numTrades(history.getNumTrades())
                .valueHis(history.getValueHis())
                .hisOpen(history.getHisOpen())
                .lowHis(history.getLowHis())
                .highHis(history.getHighHis())
                .legalClosePrice(history.getLegalClosePrice())
                .waPrice(history.getWaPrice())
                .closeHis(history.getCloseHis())
                .volumeHis(history.getVolumeHis())
                .marketPrice2(history.getMarketPrice2())
                .marketPrice3(history.getMarketPrice3())
                .admittedQuote(history.getAdmittedQuote())
                .marketPrice3TradesValue(history.getMarketPrice3TradesValue())
                .admittedValue(history.getAdmittedValue())
                .build();
    }

}
