package com.example.Maat.service;

import com.example.Maat.dto.HistoryDto;
import com.example.Maat.entity.History;
import org.springframework.stereotype.Component;

@Component
public class HistoryConverter {

    public History fromHistoryDtoToHistory(HistoryDto historyDto) {
        return History.builder()
                .hisId(historyDto.getHisId())
                .boardId(historyDto.getBoardId())
                .tradeDate(historyDto.getTradeDate())
                .shortHistoryName(historyDto.getShortHistoryName())
                .secHisId(historyDto.getSecHisId())
                .numTrades(historyDto.getNumTrades())
                .valueHis(historyDto.getValueHis())
                .hisOpen(historyDto.getHisOpen())
                .lowHis(historyDto.getLowHis())
                .highHis(historyDto.getHighHis())
                .legalClosePrice(historyDto.getLegalClosePrice())
                .waPrice(historyDto.getWaPrice())
                .closeHis(historyDto.getCloseHis())
                .volumeHis(historyDto.getVolumeHis())
                .marketPrice2(historyDto.getMarketPrice2())
                .marketPrice3(historyDto.getMarketPrice3())
                .admittedQuote(historyDto.getAdmittedQuote())
                .marketPrice3TradesValue(historyDto.getMarketPrice3TradesValue())
                .admittedValue(historyDto.getAdmittedValue())
                .build();
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
