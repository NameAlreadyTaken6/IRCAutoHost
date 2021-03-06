package autohost.utils;

import org.json.JSONException;
import org.json.JSONObject;

public class Beatmap {
	public int RequestedBy;
	public String artist;
	public int play_length;
	public String gamemode;
	public int pass_count;
	public int total_length;
	public int beatmapset_id;
	public String genre; // 0 = any, 1 = unspecified, 2 = video game, 3 = anime,
							// 4 = rock, 5 = pop, 6 = other, 7 = novelty, 9 =
							// hip hop, 10 = electronic (note that there's no 8)
	public String mapper;
	public String date;
	public String source;
	public int beatmap_id;
	public int beatmap_status;
	public int map_count;
	public int favorites;
	public String language; // 0 = any, 1 = other, 2 = english, 3 = japanese, 4
							// = chinese, 5 = instrumental, 6 = korean, 7 =
							// french, 8 = german, 9 = swedish, 10 = spanish, 11
							// = italian
	public String title;
	public String difficulty_name;
	public double difficulty;
	public double difficulty_cs;
	public double difficulty_od;
	public double difficulty_ar;
	public double difficulty_hp;
	public int bpm;
	public int play_count;
	public int graveyard;
	public Boolean ignored;
	public String mods;
	public String[] tags;
	public int maxcombo;
	public Boolean DT;
	public Boolean NC;
	public Boolean HT;

	public Beatmap() {
	};

	public Beatmap(JSONObject obj) throws JSONException {
		this.DT = this.NC = this.HT = false;
		this.gamemode = obj.getString("mode"); 
		this.graveyard = obj.getInt("approved");
		this.artist = obj.getString("artist");
		this.title = obj.getString("title");
		this.mapper = obj.getString("creator");
		this.beatmap_id = obj.getInt("beatmap_id");
		this.beatmapset_id = obj.getInt("beatmapset_id");
		this.bpm = obj.getInt("bpm");
		this.difficulty_name = obj.getString("version");
		this.difficulty = obj.getDouble("difficultyrating");
		this.difficulty_ar = obj.getDouble("diff_approach");
		this.difficulty_cs = obj.getDouble("diff_size");
		this.difficulty_od = obj.getDouble("diff_overall");
		this.difficulty_hp = obj.getDouble("diff_drain");
		this.play_length = obj.getInt("hit_length");
		this.date = obj.getString("last_update");
		this.source = obj.getString("source");
		this.genre = obj.getString("genre_id");
		this.total_length = obj.getInt("total_length");
		this.tags = obj.getString("tags").split(" ");
		this.play_count = obj.getInt("playcount");
		this.pass_count = obj.getInt("passcount");
		this.maxcombo = obj.getInt("max_combo");
	};
}
