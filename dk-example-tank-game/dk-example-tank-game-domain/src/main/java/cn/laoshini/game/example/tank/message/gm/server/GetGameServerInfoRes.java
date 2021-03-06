package cn.laoshini.game.example.tank.message.gm.server;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import cn.laoshini.dk.domain.dto.GameServerInfoDTO;
import cn.laoshini.game.example.tank.annotation.TankMessage;
import cn.laoshini.game.example.tank.constant.TankConstants;

/**
 * @author fagarine
 */
@Getter
@Setter
@ToString
@TankMessage(id = GetGameServerInfoRes.MESSAGE_ID, gm = true)
public class GetGameServerInfoRes {

    public static final int MESSAGE_ID = TankConstants.GM_HEAD + TankConstants.GET_GAME_SERVER_INFO_REQ + 1;

    private List<GameServerInfoDTO> servers;
}
