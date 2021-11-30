package com.troy.narutojutsuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private JutsuAdapter adapter;
    RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<JutsuItem> jutsuItems = new ArrayList<>();

        jutsuItems.add(new JutsuItem("https://jut.su/gif/prevraschenie.gif",R.drawable.seal_common,
                Utils.JUTSU_1_TITLE,
                Utils.JUTSU_1_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tenevoe-klonirovanie.gif",R.drawable.seal_duplicate,
                Utils.JUTSU_2_TITLE,
                Utils.JUTSU_2_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/plasch-nevidimka.gif",0,
                Utils.JUTSU_3_TITLE,
                Utils.JUTSU_3_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.otslezh,
                Utils.JUTSU_4_TITLE,
                Utils.JUTSU_4_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/garem.gif",R.drawable.seal_harem,
                Utils.JUTSU_5_TITLE,
                Utils.JUTSU_5_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/osvobozhdenie-ot-verevok.gif",0,
                Utils.JUTSU_6_TITLE,
                Utils.JUTSU_6_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tysyacheletie-boli.gif",R.drawable.seal_tiger,
                Utils.JUTSU_7_TITLE,
                Utils.JUTSU_7_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prostoe-ognennoe-plamya.gif",R.drawable.seal_simplefire,
                Utils.JUTSU_8_TITLE,
                Utils.JUTSU_8_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kara-gromom-i-molniey.gif",R.drawable.seal_kara,
                Utils.JUTSU_9_TITLE,
                Utils.JUTSU_9_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/mirazh-smerti-gendzyucu.gif",R.drawable.seal_rat,
                Utils.JUTSU_10_TITLE,
                Utils.JUTSU_10_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/podzemnoe-obezglavlivanie.gif",0,
                Utils.JUTSU_11_TITLE,
                Utils.JUTSU_11_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/regeneraciya-kletok-dzhinchuriki.gif",0,
                Utils.JUTSU_12_TITLE,
                Utils.JUTSU_12_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/sliyanie-s-vodoy.gif",0,
                Utils.JUTSU_13_TITLE,
                Utils.JUTSU_13_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/rastvorenie-v-tumane.gif",0,
                Utils.JUTSU_14_TITLE,
                Utils.JUTSU_14_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodyanoy-klon.gif",R.drawable.seal_tiger,
                Utils.JUTSU_15_TITLE,
                Utils.JUTSU_15_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/hozhdenie-po-vode.gif",0,
                Utils.JUTSU_16_TITLE,
                Utils.JUTSU_16_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.beshkill,
                Utils.JUTSU_17_TITLE,
                Utils.JUTSU_17_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.mech,
                Utils.JUTSU_18_TITLE,
                Utils.JUTSU_18_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodnaya-tyurma.gif",R.drawable.seal_turma,
                Utils.JUTSU_19_TITLE,
                Utils.JUTSU_19_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/sovmestnaya-ataka-syurikenom.gif",0,
                Utils.JUTSU_20_TITLE,
                Utils.JUTSU_20_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.surik,
                Utils.JUTSU_21_TITLE,
                Utils.JUTSU_21_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kopirovanie-sharinganom.gif",0,
                Utils.JUTSU_22_TITLE,
                Utils.JUTSU_22_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.sharin,
                Utils.JUTSU_23_TITLE,
                Utils.JUTSU_23_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/hozhdenie-po-derevyam.gif",R.drawable.seal_common,
                Utils.JUTSU_24_TITLE,
                Utils.JUTSU_24_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodyanye-igly.gif",0,
                Utils.JUTSU_25_TITLE,
                Utils.JUTSU_25_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ledyanye-zerkala-demonov.gif",0,
                Utils.JUTSU_26_TITLE,
                Utils.JUTSU_26_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-sobachek.gif",R.drawable.seal_dogs,
                Utils.JUTSU_27_TITLE,
                Utils.JUTSU_27_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ledyanye-shipy.gif",0,
                Utils.JUTSU_28_TITLE,
                Utils.JUTSU_28_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/raykiri.gif",R.drawable.seal_raikiri,
                Utils.JUTSU_29_TITLE,
                Utils.JUTSU_29_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/smertelnyy-udar-dyavola.gif",0,
                Utils.JUTSU_30_TITLE,
                Utils.JUTSU_30_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/niti-chakry.gif",0,
                Utils.JUTSU_31_TITLE,
                Utils.JUTSU_31_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/opticheskiy-obman.gif",0,
                Utils.JUTSU_32_TITLE,
                Utils.JUTSU_32_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/shtorm-listev.gif",0,
                Utils.JUTSU_33_TITLE,
                Utils.JUTSU_33_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.tenlistvi,
                Utils.JUTSU_34_TITLE,
                Utils.JUTSU_34_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.ironfist,
                Utils.JUTSU_35_TITLE,
                Utils.JUTSU_35_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/perenos-razuma.gif",0,
                Utils.JUTSU_36_TITLE,
                Utils.JUTSU_36_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tretiy-glaz.gif",0,
                Utils.JUTSU_37_TITLE,
                Utils.JUTSU_37_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/velikiy-poryv.gif",0,
                Utils.JUTSU_38_TITLE,
                Utils.JUTSU_38_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/myagkaya-modifikaciya-teloslozheniya.gif",0,
                Utils.JUTSU_39_TITLE,
                Utils.JUTSU_39_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pechat-pyati-elementov.gif",0,
                Utils.JUTSU_40_TITLE,
                Utils.JUTSU_40_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zmeinoe-plamya.gif",0,
                Utils.JUTSU_41_TITLE,
                Utils.JUTSU_41_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prostoe-plamya-drakona.gif",R.drawable.seal_simpledragonfire,
                Utils.JUTSU_42_TITLE,
                Utils.JUTSU_42_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/predotvraschenie-atak.gif",0,
                Utils.JUTSU_43_TITLE,
                Utils.JUTSU_43_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/proklyataya-pechat-neba.gif",0,
                Utils.JUTSU_44_TITLE,
                Utils.JUTSU_44_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/gryazevoy-klon.gif",0,
                Utils.JUTSU_45_TITLE,
                Utils.JUTSU_45_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ruki-zmei.gif",R.drawable.seal_snakehands,
                Utils.JUTSU_46_TITLE,
                Utils.JUTSU_46_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/padenie-sokola.gif",0,
                Utils.JUTSU_47_TITLE,
                Utils.JUTSU_47_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vremennyy-paralich.gif",0,
                Utils.JUTSU_48_TITLE,
                Utils.JUTSU_48_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vzaimnoe-ubiystvo-dvoynoy-zmei.gif",0,
                Utils.JUTSU_49_TITLE,
                Utils.JUTSU_49_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/svyazyvanie-leskoy.gif",0,
                Utils.JUTSU_50_TITLE,
                Utils.JUTSU_50_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.kraza,
                Utils.JUTSU_51_TITLE,
                Utils.JUTSU_51_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/osnovnoy-lotos.gif",0,
                Utils.JUTSU_52_TITLE,
                Utils.JUTSU_52_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/myagkaya-zvukovaya-podushka.gif",R.drawable.seal_podushka,
                Utils.JUTSU_53_TITLE,
                Utils.JUTSU_53_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zamena.gif",R.drawable.seal_zamena,
                Utils.JUTSU_54_TITLE,
                Utils.JUTSU_54_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vibriruyuschiy-zvuk-dreli.gif",0,
                Utils.JUTSU_55_TITLE,
                Utils.JUTSU_55_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/razyaschie-volny-vozduha.gif",0,
                Utils.JUTSU_56_TITLE,
                Utils.JUTSU_56_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/myasnoy-tank.gif",R.drawable.seal_elephant,
                Utils.JUTSU_57_TITLE,
                Utils.JUTSU_57_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tenevoy-paralich.gif",R.drawable.seal_rat,
                Utils.JUTSU_58_TITLE,
                Utils.JUTSU_58_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/sverhzvukovoy-vozdushnyy-disk.gif",0,
                Utils.JUTSU_59_TITLE,
                Utils.JUTSU_59_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/dozhd-senbonov.gif",R.drawable.seal_tiger,
                Utils.JUTSU_60_TITLE,
                Utils.JUTSU_60_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/absolyutnaya-zaschita.gif",0,
                Utils.JUTSU_61_TITLE,
                Utils.JUTSU_61_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanyy-grob.gif",R.drawable.seal_rooster,
                Utils.JUTSU_62_TITLE,
                Utils.JUTSU_62_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanye-pohorony.gif",0,
                Utils.JUTSU_63_TITLE,
                Utils.JUTSU_63_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/skrytyy-kamuflyazh.gif",R.drawable.seal_tiger,
                Utils.JUTSU_64_TITLE,
                Utils.JUTSU_64_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tumannyy-sluga-gendzyucu.gif",0,
                Utils.JUTSU_65_TITLE,
                Utils.JUTSU_65_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/hitroumnaya-lovushka-gendzyucu.gif",0,
                Utils.JUTSU_66_TITLE,
                Utils.JUTSU_66_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/dymovoe-klonirovanie.gif",R.drawable.seal_dymklon,
                Utils.JUTSU_67_TITLE,
                Utils.JUTSU_67_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/podzemnaya-proekciya.gif",0,
                Utils.JUTSU_68_TITLE,
                Utils.JUTSU_68_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vysasyvanie-chakry.gif",R.drawable.seal_tiger,
                Utils.JUTSU_69_TITLE,
                Utils.JUTSU_69_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pechat-podavleniya-zla.gif",R.drawable.seal_zla,
                Utils.JUTSU_70_TITLE,
                Utils.JUTSU_70_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/parazitiruyuschie-zhuki.gif",R.drawable.seal_tiger,
                Utils.JUTSU_71_TITLE,
                Utils.JUTSU_71_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/lovushka-volos.gif",0,
                Utils.JUTSU_72_TITLE,
                Utils.JUTSU_72_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zvuchaschie-senbony-gendzyucu.gif",0,
                Utils.JUTSU_73_TITLE,
                Utils.JUTSU_73_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/serp-laski.gif",0,
                Utils.JUTSU_74_TITLE,
                Utils.JUTSU_74_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/podrazhanie-zveryu-klon.gif",R.drawable.seal_tiger,
                Utils.JUTSU_75_TITLE,
                Utils.JUTSU_75_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/dvoynoy-pronzayuschiy-klyk.gif",0,
                Utils.JUTSU_76_TITLE,
                Utils.JUTSU_76_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/imitaciya-zverya-chetyre-lapy.gif",R.drawable.seal_tiger,
                Utils.JUTSU_77_TITLE,
                Utils.JUTSU_77_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kombo-uzumaki-naruto.gif",0,
                Utils.JUTSU_78_TITLE,
                Utils.JUTSU_78_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/myagkaya-ladon.gif",0,
                Utils.JUTSU_79_TITLE,
                Utils.JUTSU_79_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanye-dospehi.gif",0,
                Utils.JUTSU_80_TITLE,
                Utils.JUTSU_80_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/otkrytie-vrat-chakry.gif",0,
                Utils.JUTSU_81_TITLE,
                Utils.JUTSU_81_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/obratnyy-lotos.gif",0,
                Utils.JUTSU_82_TITLE,
                Utils.JUTSU_82_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/podchinenie-mertvogo-tela.gif",0,
                Utils.JUTSU_83_TITLE,
                Utils.JUTSU_83_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/snyatie-pechati-pyati-elementov.gif",0,
                Utils.JUTSU_84_TITLE,
                Utils.JUTSU_84_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/lunnyy-tanec.gif",0,
                Utils.JUTSU_85_TITLE,
                Utils.JUTSU_85_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-zhaby.gif",R.drawable.seal_prizivzhaby,
                Utils.JUTSU_86_TITLE,
                Utils.JUTSU_86_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosem-trigramm-nebesnoe-vraschenie.gif",0,
                Utils.JUTSU_87_TITLE,
                Utils.JUTSU_87_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosem-trigramm-shestdesyat-chetyre-ladoni-nebes.gif",0,
                Utils.JUTSU_88_TITLE,
                Utils.JUTSU_88_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanyy-klon.gif",0,
                Utils.JUTSU_89_TITLE,
                Utils.JUTSU_89_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/hram-nirvany-gendzyucu.gif",R.drawable.seal_tiger,
                Utils.JUTSU_90_TITLE,
                Utils.JUTSU_90_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ognennoe-plamya.gif",R.drawable.seal_struiplameni,
                Utils.JUTSU_91_TITLE,
                Utils.JUTSU_91_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ognennyy-barer.gif",R.drawable.seal_barer,
                Utils.JUTSU_92_TITLE,
                Utils.JUTSU_92_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/syuriken-cherepicy.gif",R.drawable.seal_cherep,
                Utils.JUTSU_93_TITLE,
                Utils.JUTSU_93_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/syuriken-teni-klona.gif",R.drawable.seal_shurikenteni,
                Utils.JUTSU_94_TITLE,
                Utils.JUTSU_94_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-ozhivlenie-treh-hokage.gif",R.drawable.seal_prizivhokage,
                Utils.JUTSU_95_TITLE,
                Utils.JUTSU_95_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/strelyayuschiy-gryazyu-i-ognem-drakon.gif",R.drawable.seal_firedragon,
                Utils.JUTSU_96_TITLE,
                Utils.JUTSU_96_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/velikaya-ilistaya-reka.gif",R.drawable.seal_tiger,
                Utils.JUTSU_97_TITLE,
                Utils.JUTSU_97_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/plamya-drakona.gif",R.drawable.seal_plamyadrakona,
                Utils.JUTSU_98_TITLE,
                Utils.JUTSU_98_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/stena-vody.gif",R.drawable.seal_stenavody,
                Utils.JUTSU_99_TITLE,
                Utils.JUTSU_99_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udarnaya-volna.gif",R.drawable.seal_udarnayavolna,
                Utils.JUTSU_100_TITLE,
                Utils.JUTSU_100_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/sotvorenie-lesa.gif",R.drawable.seal_les,
                Utils.JUTSU_101_TITLE,
                Utils.JUTSU_101_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/transformaciya-v-posoh.gif",0,
                Utils.JUTSU_102_TITLE,
                Utils.JUTSU_102_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cvety-feniksa.gif",R.drawable.seal_fenix,
                Utils.JUTSU_103_TITLE,
                Utils.JUTSU_103_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ognennyy-shar.gif",R.drawable.seal_fireshar,
                Utils.JUTSU_104_TITLE,
                Utils.JUTSU_104_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-korolya-obezyan.gif",R.drawable.kingmonkey,
                Utils.JUTSU_105_TITLE,
                Utils.JUTSU_105_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/lico-pechat-smerti.gif",R.drawable.seal_pechatsmerti,
                Utils.JUTSU_106_TITLE,
                Utils.JUTSU_106_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/besprosvetnaya-mgla-gendzyucu.gif",R.drawable.seal_tiger,
                Utils.JUTSU_107_TITLE,
                Utils.JUTSU_107_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanaya-burya.gif",0,
                Utils.JUTSU_108_TITLE,
                Utils.JUTSU_108_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/almaznaya-tyurma.gif",0,
                Utils.JUTSU_109_TITLE,
                Utils.JUTSU_109_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kontrol-mecha-kusanagi.gif",0,
                Utils.JUTSU_110_TITLE,
                Utils.JUTSU_110_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/davlenie-zhabey-massy.gif",0,
                Utils.JUTSU_111_TITLE,
                Utils.JUTSU_111_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-trehglavoy-zmei.gif",0,
                Utils.JUTSU_112_TITLE,
                Utils.JUTSU_112_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zhuchiy-klon.gif",0,
                Utils.JUTSU_113_TITLE,
                Utils.JUTSU_113_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/chidori.gif",R.drawable.seal_chidori,
                Utils.JUTSU_114_TITLE,
                Utils.JUTSU_114_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ataka-lezviy.gif",0,
                Utils.JUTSU_115_TITLE,
                Utils.JUTSU_115_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanye-syurikeny.gif",0,
                Utils.JUTSU_116_TITLE,
                Utils.JUTSU_116_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanaya-burya-demona.gif",0,
                Utils.JUTSU_117_TITLE,
                Utils.JUTSU_117_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.kara,
                Utils.JUTSU_118_TITLE,
                Utils.JUTSU_118_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prinuditelnyy-son.gif",R.drawable.seal_sheep,
                Utils.JUTSU_119_TITLE,
                Utils.JUTSU_119_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodyanoe-yadro.gif",R.drawable.seal_tiger,
                Utils.JUTSU_120_TITLE,
                Utils.JUTSU_120_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vozdushnye-puli.gif",0,
                Utils.JUTSU_121_TITLE,
                Utils.JUTSU_121_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/sovmestnoe-prevraschenie.gif",R.drawable.seal_sheep,
                Utils.JUTSU_122_TITLE,
                Utils.JUTSU_122_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vsenapravlennyy-obstrel-syurikenami.gif",0,
                Utils.JUTSU_123_TITLE,
                Utils.JUTSU_123_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udar-tel-klonov.gif",0,
                Utils.JUTSU_124_TITLE,
                Utils.JUTSU_124_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/dvuhtysyachnaya-kombinaciya-naruto.gif",0,
                Utils.JUTSU_125_TITLE,
                Utils.JUTSU_125_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.kazn,
                Utils.JUTSU_126_TITLE,
                Utils.JUTSU_126_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/razrusheniya-razuma.gif",0,
                Utils.JUTSU_127_TITLE,
                Utils.JUTSU_127_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pauchya-set.gif",R.drawable.seal_tiger,
                Utils.JUTSU_128_TITLE,
                Utils.JUTSU_128_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/obhvatyvayuschie-derevya-gendzyucu.gif",R.drawable.seal_derevya,
                Utils.JUTSU_129_TITLE,
                Utils.JUTSU_129_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/letayuschaya-lastochka.gif",0,
                Utils.JUTSU_130_TITLE,
                Utils.JUTSU_130_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.zerkalo,
                Utils.JUTSU_131_TITLE,
                Utils.JUTSU_131_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vzryvnoy-klon.gif",0,
                Utils.JUTSU_132_TITLE,
                Utils.JUTSU_132_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/moschneyshiy-vihr-konohi.gif",0,
                Utils.JUTSU_133_TITLE,
                Utils.JUTSU_133_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cukuemi-gendzyucu.gif",0,
                Utils.JUTSU_134_TITLE,
                Utils.JUTSU_134_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodnyy-klyk.gif",0,
                Utils.JUTSU_135_TITLE,
                Utils.JUTSU_135_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zhabiy-rot.gif",R.drawable.seal_rot,
                Utils.JUTSU_136_TITLE,
                Utils.JUTSU_136_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ognennaya-pechat.gif",R.drawable.firepechat,
                Utils.JUTSU_137_TITLE,
                Utils.JUTSU_137_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/dinamicheskoe-poyavlenie.gif",0,
                Utils.JUTSU_138_TITLE,
                Utils.JUTSU_138_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/rasengan.gif",R.drawable.seal_handconcent,
                Utils.JUTSU_139_TITLE,
                Utils.JUTSU_139_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/sosredotocheniya-nindzya-lista.gif",0,
                Utils.JUTSU_140_TITLE,
                Utils.JUTSU_140_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/povyshennaya-prochnost.gif",0,
                Utils.JUTSU_141_TITLE,
                Utils.JUTSU_141_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.vistreliglami,
                Utils.JUTSU_142_TITLE,
                Utils.JUTSU_142_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/bystroe-iscelenie.gif",R.drawable.fastheal,
                Utils.JUTSU_143_TITLE,
                Utils.JUTSU_143_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/narushayuschiy-udar.gif",0,
                Utils.JUTSU_144_TITLE,
                Utils.JUTSU_144_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/skalpel-chakry.gif",R.drawable.skalpel,
                Utils.JUTSU_145_TITLE,
                Utils.JUTSU_145_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/nebesnaya-noga-boli.gif",0,
                Utils.JUTSU_146_TITLE,
                Utils.JUTSU_146_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.igly,
                Utils.JUTSU_147_TITLE,
                Utils.JUTSU_147_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-zmei.gif",R.drawable.prizivzmei,
                Utils.JUTSU_148_TITLE,
                Utils.JUTSU_148_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/topkoe-boloto.gif",R.drawable.boloto,
                Utils.JUTSU_149_TITLE,
                Utils.JUTSU_149_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/yad-lyagushki.gif",0,
                Utils.JUTSU_150_TITLE,
                Utils.JUTSU_150_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kolyuchiy-strazh.gif",R.drawable.strazh,
                Utils.JUTSU_151_TITLE,
                Utils.JUTSU_151_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prezhdevremennoe-zazhivlenie-ran.gif",0,
                Utils.JUTSU_152_TITLE,
                Utils.JUTSU_152_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/snyatie-sekretnoy-pechati.gif",R.drawable.seal_tiger,
                Utils.JUTSU_153_TITLE,
                Utils.JUTSU_153_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/regeneraciya-kletok.gif",0,
                Utils.JUTSU_154_TITLE,
                Utils.JUTSU_154_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zazhigatelnoe-plamya.gif",R.drawable.zazhigatelnoeplamya,
                Utils.JUTSU_155_TITLE,
                Utils.JUTSU_155_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/nebolshoe-peremeschenie-ischeznovenie.gif",R.drawable.ischez,
                Utils.JUTSU_156_TITLE,
                Utils.JUTSU_156_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/razdelenie-tela-sliznya.gif",0,
                Utils.JUTSU_157_TITLE,
                Utils.JUTSU_157_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udar-kislotoy.gif",0,
                Utils.JUTSU_158_TITLE,
                Utils.JUTSU_158_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.zaxvat,
                Utils.JUTSU_159_TITLE,
                Utils.JUTSU_159_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.kletok,
                Utils.JUTSU_160_TITLE,
                Utils.JUTSU_160_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/chernyy-dozhd.gif",R.drawable.dozhd,
                Utils.JUTSU_161_TITLE,
                Utils.JUTSU_161_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/lozhnaya-mestnost-gendzyucu.gif",0,
                Utils.JUTSU_162_TITLE,
                Utils.JUTSU_162_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/lipkaya-pautina.gif",0,
                Utils.JUTSU_163_TITLE,
                Utils.JUTSU_163_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udar-plechom.gif",0,
                Utils.JUTSU_164_TITLE,
                Utils.JUTSU_164_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pechat-tmy.gif",R.drawable.seal_inconcent,
                Utils.JUTSU_165_TITLE,
                Utils.JUTSU_165_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/chetyrehstoronnyaya-pechat-tumana.gif",0,
                Utils.JUTSU_166_TITLE,
                Utils.JUTSU_166_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/proklyataya-pechat-pervoy-stadii.gif",0,
                Utils.JUTSU_167_TITLE,
                Utils.JUTSU_167_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-ritualnogo-sosuda.gif",0,
                Utils.JUTSU_168_TITLE,
                Utils.JUTSU_168_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/chetyrehugolnyy-vzryvnoy-barer.gif",0,
                Utils.JUTSU_169_TITLE,
                Utils.JUTSU_169_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.areal,
                Utils.JUTSU_170_TITLE,
                Utils.JUTSU_170_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.klyk,
                Utils.JUTSU_171_TITLE,
                Utils.JUTSU_171_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zemlyanoy-kupol.gif",0,
                Utils.JUTSU_172_TITLE,
                Utils.JUTSU_172_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udar-kolenom.gif",0,
                Utils.JUTSU_173_TITLE,
                Utils.JUTSU_173_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zemlyanoy-valun.gif",0,
                Utils.JUTSU_174_TITLE,
                Utils.JUTSU_174_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/drozh-zemli.gif",R.drawable.seal_snake,
                Utils.JUTSU_175_TITLE,
                Utils.JUTSU_175_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zemlyanoy-schit.gif",0,
                Utils.JUTSU_176_TITLE,
                Utils.JUTSU_176_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/shipovannyy-myasnoy-tank.gif",R.drawable.meattank,
                Utils.JUTSU_177_TITLE,
                Utils.JUTSU_177_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/chastichnoe-uvelichenie-rosta.gif",0,
                Utils.JUTSU_178_TITLE,
                Utils.JUTSU_178_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/sokrushayuschiy-kulak.gif",0,
                Utils.JUTSU_179_TITLE,
                Utils.JUTSU_179_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/mega-rost.gif",R.drawable.seal_elephant,
                Utils.JUTSU_180_TITLE,
                Utils.JUTSU_180_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kontrol-kaloriy.gif",0,
                Utils.JUTSU_181_TITLE,
                Utils.JUTSU_181_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/snaryad-babochki.gif",0,
                Utils.JUTSU_182_TITLE,
                Utils.JUTSU_182_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/razyaschaya-ladon.gif",0,
                Utils.JUTSU_183_TITLE,
                Utils.JUTSU_183_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/davyaschaya-ladon.gif",0,
                Utils.JUTSU_184_TITLE,
                Utils.JUTSU_184_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/razrushayuschiy-udar.gif",0,
                Utils.JUTSU_185_TITLE,
                Utils.JUTSU_185_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/poedanie-chakry.gif",0,
                Utils.JUTSU_186_TITLE,
                Utils.JUTSU_186_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cvetok-pauchey-seti.gif",0,
                Utils.JUTSU_187_TITLE,
                Utils.JUTSU_187_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pauchiy-kokon.gif",0,
                Utils.JUTSU_188_TITLE,
                Utils.JUTSU_188_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/lipkoe-zoloto-pauka.gif",0,
                Utils.JUTSU_189_TITLE,
                Utils.JUTSU_189_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pauchya-lovushka.gif",0,
                Utils.JUTSU_190_TITLE,
                Utils.JUTSU_190_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosem-trigramm-udar-telom.gif",0,
                Utils.JUTSU_191_TITLE,
                Utils.JUTSU_191_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-pauka.gif",R.drawable.prizivpauka,
                Utils.JUTSU_192_TITLE,
                Utils.JUTSU_192_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pauchya-bronya.gif",0,
                Utils.JUTSU_193_TITLE,
                Utils.JUTSU_193_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosem-trigramm-sto-dvadcat-vosem-udarov-nebes.gif",0,
                Utils.JUTSU_194_TITLE,
                Utils.JUTSU_194_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/luk-iz-pauchey-slizi.gif",0,
                Utils.JUTSU_195_TITLE,
                Utils.JUTSU_195_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zmeinaya-reinkarnaciya.gif",0,
                Utils.JUTSU_196_TITLE,
                Utils.JUTSU_196_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.pechatzemli,
                Utils.JUTSU_197_TITLE,
                Utils.JUTSU_197_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/svyaznoy-kulak.gif",0,
                Utils.JUTSU_198_TITLE,
                Utils.JUTSU_198_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ataka-demonov-bliznecov.gif",0,
                Utils.JUTSU_199_TITLE,
                Utils.JUTSU_199_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/upravlenie-tremya-zombi-velikanami.gif",0,
                Utils.JUTSU_200_TITLE,
                Utils.JUTSU_200_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pronzayuschiy-klyk-dvuglavogo-volka.gif",0,
                Utils.JUTSU_201_TITLE,
                Utils.JUTSU_201_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prevraschenie-v-dvuglavogo-volka.gif",0,
                Utils.JUTSU_202_TITLE,
                Utils.JUTSU_202_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/demonicheskiy-parazit.gif",0,
                Utils.JUTSU_203_TITLE,
                Utils.JUTSU_203_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-vrat-rashomon.gif",R.drawable.seal_snake,
                Utils.JUTSU_204_TITLE,
                Utils.JUTSU_204_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-treh-zombi-velikanov.gif",0,
                Utils.JUTSU_205_TITLE,
                Utils.JUTSU_205_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/razdelenie-bratev.gif",0,
                Utils.JUTSU_206_TITLE,
                Utils.JUTSU_206_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tanec-kamelii.gif",0,
                Utils.JUTSU_207_TITLE,
                Utils.JUTSU_207_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tanec-ivy.gif",0,
                Utils.JUTSU_208_TITLE,
                Utils.JUTSU_208_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zvuk-prizrachnyh-cepey-gendzyucu.gif",0,
                Utils.JUTSU_209_TITLE,
                Utils.JUTSU_209_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosstanie-mira-demonov.gif",0,
                Utils.JUTSU_210_TITLE,
                Utils.JUTSU_210_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vihr-listev.gif",0,
                Utils.JUTSU_211_TITLE,
                Utils.JUTSU_211_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/velikiy-vihr-konohi.gif",0,
                Utils.JUTSU_212_TITLE,
                Utils.JUTSU_212_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pyanyy-kulak.gif",0,
                Utils.JUTSU_213_TITLE,
                Utils.JUTSU_213_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tanec-listvennicy.gif",0,
                Utils.JUTSU_214_TITLE,
                Utils.JUTSU_214_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/odnostrelnaya-mashina.gif",0,
                Utils.JUTSU_215_TITLE,
                Utils.JUTSU_215_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/gigantskoe-lezvie-vetra.gif",0,
                Utils.JUTSU_216_TITLE,
                Utils.JUTSU_216_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-tanca-lezviy.gif",0,
                Utils.JUTSU_217_TITLE,
                Utils.JUTSU_217_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/puli-iz-palcev.gif",0,
                Utils.JUTSU_218_TITLE,
                Utils.JUTSU_218_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanyy-vodopad.gif",R.drawable.vodopad,
                Utils.JUTSU_219_TITLE,
                Utils.JUTSU_219_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanyy-dozhd.gif",0,
                Utils.JUTSU_220_TITLE,
                Utils.JUTSU_220_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/korolevskie-pohorony.gif",0,
                Utils.JUTSU_221_TITLE,
                Utils.JUTSU_221_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kost-cvetok.gif",0,
                Utils.JUTSU_222_TITLE,
                Utils.JUTSU_222_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kost-loza.gif",0,
                Utils.JUTSU_223_TITLE,
                Utils.JUTSU_223_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tanec-rassady-paporotnikov.gif",0,
                Utils.JUTSU_224_TITLE,
                Utils.JUTSU_224_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vozdushnaya-pustynya.gif",0,
                Utils.JUTSU_225_TITLE,
                Utils.JUTSU_225_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zahoronenie-peschanoy-tyurmy.gif",R.drawable.seal_common,
                Utils.JUTSU_226_TITLE,
                Utils.JUTSU_226_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/absolyutnaya-zaschita-schit-shukaku.gif",0,
                Utils.JUTSU_227_TITLE,
                Utils.JUTSU_227_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.shit,
                Utils.JUTSU_228_TITLE,
                Utils.JUTSU_228_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kagero.gif",0,
                Utils.JUTSU_229_TITLE,
                Utils.JUTSU_229_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/skorbnoe-chidori.gif",R.drawable.skorbnoe,
                Utils.JUTSU_230_TITLE,
                Utils.JUTSU_230_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/alyy-rasengan.gif",0,
                Utils.JUTSU_231_TITLE,
                Utils.JUTSU_231_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosstanovlenie-ploti.gif",0,
                Utils.JUTSU_232_TITLE,
                Utils.JUTSU_232_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/lunnoe-otrazhenie-tela.gif",0,
                Utils.JUTSU_233_TITLE,
                Utils.JUTSU_233_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosstanie-iz-ada.gif",R.drawable.seal_sheep,
                Utils.JUTSU_234_TITLE,
                Utils.JUTSU_234_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pustye-golosa-cikady.gif",R.drawable.seal_sheep,
                Utils.JUTSU_235_TITLE,
                Utils.JUTSU_235_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pauki-vetra.gif",0,
                Utils.JUTSU_236_TITLE,
                Utils.JUTSU_236_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/potok-zhiznennoy-chakry.gif",R.drawable.potokchakry,
                Utils.JUTSU_237_TITLE,
                Utils.JUTSU_237_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.volosa,
                Utils.JUTSU_238_TITLE,
                Utils.JUTSU_238_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tancuyuschaya-mgla.gif",R.drawable.mgla,
                Utils.JUTSU_239_TITLE,
                Utils.JUTSU_239_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/niti-chakry-klana-fuma.gif",0,
                Utils.JUTSU_240_TITLE,
                Utils.JUTSU_240_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/mertvye-marionetki.gif",0,
                Utils.JUTSU_241_TITLE,
                Utils.JUTSU_241_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/yaschik-mandaly.gif",R.drawable.mandala,
                Utils.JUTSU_242_TITLE,
                Utils.JUTSU_242_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.pogruz,
                Utils.JUTSU_243_TITLE,
                Utils.JUTSU_243_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/paralizuyuschee-gendzyucu.gif",0,
                Utils.JUTSU_244_TITLE,
                Utils.JUTSU_244_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.beastpechat,
                Utils.JUTSU_245_TITLE,
                Utils.JUTSU_245_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kvadrat-vzryvnyh-svitkov.gif",R.drawable.kvadrat,
                Utils.JUTSU_246_TITLE,
                Utils.JUTSU_246_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cbor-nasekomyh.gif",R.drawable.seal_sheep,
                Utils.JUTSU_247_TITLE,
                Utils.JUTSU_247_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.med,
                Utils.JUTSU_248_TITLE,
                Utils.JUTSU_248_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zaschitnaya-sfera-iz-zhukov.gif",R.drawable.sferazhuk,
                Utils.JUTSU_249_TITLE,
                Utils.JUTSU_249_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/tysyachi-pchelinyh-zhal.gif",R.drawable.zhal,
                Utils.JUTSU_250_TITLE,
                Utils.JUTSU_250_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/klon-iz-voska.gif",0,
                Utils.JUTSU_251_TITLE,
                Utils.JUTSU_251_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/igly-iz-chakry.gif",0,
                Utils.JUTSU_252_TITLE,
                Utils.JUTSU_252_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.sherhen,
                Utils.JUTSU_253_TITLE,
                Utils.JUTSU_253_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.bombpchel,
                Utils.JUTSU_254_TITLE,
                Utils.JUTSU_254_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.uley,
                Utils.JUTSU_255_TITLE,
                Utils.JUTSU_255_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vosem-trigramm-variant-zaschity.gif",0,
                Utils.JUTSU_256_TITLE,
                Utils.JUTSU_256_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/klyk-molnii.gif",0,
                Utils.JUTSU_257_TITLE,
                Utils.JUTSU_257_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vetvistyy-zaryad-molnii.gif",R.drawable.zaryadmolnii,
                Utils.JUTSU_258_TITLE,
                Utils.JUTSU_258_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/shar-iz-molnii.gif",0,
                Utils.JUTSU_259_TITLE,
                Utils.JUTSU_259_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/grozovye-pohorony.gif",0,
                Utils.JUTSU_260_TITLE,
                Utils.JUTSU_260_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/chernoe-tornado.gif",0,
                Utils.JUTSU_261_TITLE,
                Utils.JUTSU_261_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.peredacha,
                Utils.JUTSU_262_TITLE,
                Utils.JUTSU_262_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/burya-grozovogo-drakona.gif",0,
                Utils.JUTSU_263_TITLE,
                Utils.JUTSU_263_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/dospehi-molnii.gif",0,
                Utils.JUTSU_264_TITLE,
                Utils.JUTSU_264_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udar-pyatkoy-klona.gif",0,
                Utils.JUTSU_265_TITLE,
                Utils.JUTSU_265_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ataka-golovoy.gif",0,
                Utils.JUTSU_266_TITLE,
                Utils.JUTSU_266_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/postroenie-pirozhkov.gif",0,
                Utils.JUTSU_267_TITLE,
                Utils.JUTSU_267_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/igly-ubiycy.gif",0,
                Utils.JUTSU_268_TITLE,
                Utils.JUTSU_268_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/letyaschie-igly.gif",0,
                Utils.JUTSU_269_TITLE,
                Utils.JUTSU_269_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/super-mega-otlichnaya-giper-ataka.gif",0,
                Utils.JUTSU_270_TITLE,
                Utils.JUTSU_270_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/upodoblenie-veschey.gif",R.drawable.seal_tiger,
                Utils.JUTSU_271_TITLE,
                Utils.JUTSU_271_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/upodoblenie-kamennyy-tank.gif",0,
                Utils.JUTSU_272_TITLE,
                Utils.JUTSU_272_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/upodoblenie-pustynnyy-grob.gif",0,
                Utils.JUTSU_273_TITLE,
                Utils.JUTSU_273_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/upodoblenie-peschanye-pohorony.gif",0,
                Utils.JUTSU_274_TITLE,
                Utils.JUTSU_274_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.burya2,
                Utils.JUTSU_275_TITLE,
                Utils.JUTSU_275_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodyanoy-drakon.gif",R.drawable.vodadragon,
                Utils.JUTSU_276_TITLE,
                Utils.JUTSU_276_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/velikiy-vodopad.gif",R.drawable.vodopad2,
                Utils.JUTSU_277_TITLE,
                Utils.JUTSU_277_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/massovoe-tenevoe-lzhe-klonirovanie.gif",R.drawable.lzheklon,
                Utils.JUTSU_278_TITLE,
                Utils.JUTSU_278_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/adskoe-plamya.gif",R.drawable.adplamya,
                Utils.JUTSU_279_TITLE,
                Utils.JUTSU_279_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodnaya-voronka.gif",R.drawable.adplamya,
                Utils.JUTSU_280_TITLE,
                Utils.JUTSU_280_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-serebryanoy-zmei.gif",R.drawable.adplamya,
                Utils.JUTSU_281_TITLE,
                Utils.JUTSU_281_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ogromnyy-vodnyy-snaryad.gif",0,
                Utils.JUTSU_282_TITLE,
                Utils.JUTSU_282_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kopirovanie-lica.gif",0,
                Utils.JUTSU_283_TITLE,
                Utils.JUTSU_283_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/misticheskoe-iskusstvo-pavlina-krylya.gif",R.drawable.seal_rooster,
                Utils.JUTSU_284_TITLE,
                Utils.JUTSU_284_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/mistichiskiy-metod-pavlina.gif",R.drawable.seal_rooster,
                Utils.JUTSU_285_TITLE,
                Utils.JUTSU_285_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/misticheskoe-iskusstvo-pavlina-zver.gif",R.drawable.seal_rooster,
                Utils.JUTSU_286_TITLE,
                Utils.JUTSU_286_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/misticheskoe-iskusstvo-pavlina-razrushenie.gif",0,
                Utils.JUTSU_287_TITLE,
                Utils.JUTSU_287_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/misticheskoe-iskusstvo-pavlina-pogloschenie.gif",R.drawable.seal_rooster,
                Utils.JUTSU_288_TITLE,
                Utils.JUTSU_288_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/misticheskoe-iskusstvo-pavlina-udushenie.gif",R.drawable.seal_rooster,
                Utils.JUTSU_289_TITLE,
                Utils.JUTSU_289_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zvezdnoe-lasso.gif",R.drawable.lasso,
                Utils.JUTSU_290_TITLE,
                Utils.JUTSU_290_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pohischenie-chakry.gif",R.drawable.seal_rooster,
                Utils.JUTSU_291_TITLE,
                Utils.JUTSU_291_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/misticheskoe-iskusstvo-pavlina-otkrovenie.gif",0,
                Utils.JUTSU_292_TITLE,
                Utils.JUTSU_292_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/misticheskoe-iskusstvo-pavlina-drakon.gif",0,
                Utils.JUTSU_293_TITLE,
                Utils.JUTSU_293_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cvetochnoe-isskustvo-nindzya-sotnya-raspuskayuschihsya-cvetov.gif",0,
                Utils.JUTSU_294_TITLE,
                Utils.JUTSU_294_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cvetochnoe-iskusstvo-nindzya-cvetochnye-oskolki.gif",0,
                Utils.JUTSU_295_TITLE,
                Utils.JUTSU_295_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cvetochnaya-burya.gif",R.drawable.burya2,
                Utils.JUTSU_296_TITLE,
                Utils.JUTSU_296_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodyanoy-puzyr.gif",R.drawable.puzyr,
                Utils.JUTSU_297_TITLE,
                Utils.JUTSU_297_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ognennyy-shkval.gif",R.drawable.shkval,
                Utils.JUTSU_298_TITLE,
                Utils.JUTSU_298_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-piraniy.gif",R.drawable.piraniy,
                Utils.JUTSU_299_TITLE,
                Utils.JUTSU_299_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/massa-vodnyh-puzyrey.gif",R.drawable.vodapuzyr,
                Utils.JUTSU_300_TITLE,
                Utils.JUTSU_300_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodyanoy-myasnoy-tank.gif",0,
                Utils.JUTSU_301_TITLE,
                Utils.JUTSU_301_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/iskusstvo-magnetizma.gif",0,
                Utils.JUTSU_302_TITLE,
                Utils.JUTSU_302_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/beskonechnyy-meteoritnyy-dozhd.gif",0,
                Utils.JUTSU_303_TITLE,
                Utils.JUTSU_303_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/elektromagnitnyy-mirazh.gif",R.drawable.mirazh,
                Utils.JUTSU_304_TITLE,
                Utils.JUTSU_304_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ledyanye-diski.gif",R.drawable.icedisk,
                Utils.JUTSU_305_TITLE,
                Utils.JUTSU_305_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/gusenica-zerkal.gif",R.drawable.zerkal,
                Utils.JUTSU_306_TITLE,
                Utils.JUTSU_306_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/perehvat.gif",0,
                Utils.JUTSU_307_TITLE,
                Utils.JUTSU_307_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ostrye-nakonechniki.gif",R.drawable.nakonechniki,
                Utils.JUTSU_308_TITLE,
                Utils.JUTSU_308_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vozvedenie-prizyv-stolbov.gif",R.drawable.stolb,
                Utils.JUTSU_309_TITLE,
                Utils.JUTSU_309_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/uluchshenie-tehniki-stolbov.gif",R.drawable.beststolb,
                Utils.JUTSU_310_TITLE,
                Utils.JUTSU_310_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/bozhestvennaya-zavisimost-oblichiya.gif",R.drawable.zaviximost,
                Utils.JUTSU_311_TITLE,
                Utils.JUTSU_311_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/obratnyy-gipnoz.gif",R.drawable.gipnoz,
                Utils.JUTSU_312_TITLE,
                Utils.JUTSU_312_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udalenie-vzryvnyh-pechatey.gif",R.drawable.seal_sheep,
                Utils.JUTSU_313_TITLE,
                Utils.JUTSU_313_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vodnyy-stolb.gif",R.drawable.stolbvody,
                Utils.JUTSU_314_TITLE,
                Utils.JUTSU_314_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kamuflyazh-volos.gif",0,
                Utils.JUTSU_315_TITLE,
                Utils.JUTSU_315_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/cvetochnyy-pobeg.gif",R.drawable.pobeg,
                Utils.JUTSU_316_TITLE,
                Utils.JUTSU_316_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/svyazyvayuschaya-illyuziya.gif",R.drawable.svyaz,
                Utils.JUTSU_317_TITLE,
                Utils.JUTSU_317_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vzryv-zemli.gif",0,
                Utils.JUTSU_318_TITLE,
                Utils.JUTSU_318_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/metallicheskaya-leska.gif",R.drawable.leska,
                Utils.JUTSU_319_TITLE,
                Utils.JUTSU_319_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/metallicheskaya-sfera.gif",R.drawable.ironsfera,
                Utils.JUTSU_320_TITLE,
                Utils.JUTSU_320_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/dozhd-krovavyh-igl.gif",0,
                Utils.JUTSU_321_TITLE,
                Utils.JUTSU_321_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ognemet.gif",0,
                Utils.JUTSU_322_TITLE,
                Utils.JUTSU_322_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zvuki-okariny.gif",0,
                Utils.JUTSU_323_TITLE,
                Utils.JUTSU_323_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/podavlenie-zvuka.gif",0,
                Utils.JUTSU_324_TITLE,
                Utils.JUTSU_324_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vraschayuschiysya-svirepyy-veter.gif",0,
                Utils.JUTSU_325_TITLE,
                Utils.JUTSU_325_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/nozhi-vetra.gif",0,
                Utils.JUTSU_326_TITLE,
                Utils.JUTSU_326_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/katorga-drakona.gif",0,
                Utils.JUTSU_327_TITLE,
                Utils.JUTSU_327_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/otrazhenie-vetra.gif",0,
                Utils.JUTSU_328_TITLE,
                Utils.JUTSU_328_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/trehglavyy-drakon.gif",0,
                Utils.JUTSU_329_TITLE,
                Utils.JUTSU_329_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/glaz-drakona-klykastyy-mech.gif",0,
                Utils.JUTSU_330_TITLE,
                Utils.JUTSU_330_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/udar-bulavy.gif",0,
                Utils.JUTSU_331_TITLE,
                Utils.JUTSU_331_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vozdushnyy-poryv.gif",0,
                Utils.JUTSU_332_TITLE,
                Utils.JUTSU_332_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/barer-vodnogo-drakona.gif",0,
                Utils.JUTSU_333_TITLE,
                Utils.JUTSU_333_BODY));
        jutsuItems.add(new JutsuItem("",R.drawable.kolonna,
                Utils.JUTSU_334_TITLE,
                Utils.JUTSU_334_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/put-rokovyh-stradaniy.gif",0,
                Utils.JUTSU_335_TITLE,
                Utils.JUTSU_335_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vihr-pavlina.gif",0,
                Utils.JUTSU_336_TITLE,
                Utils.JUTSU_336_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ognennyy-potok-mecha.gif",0,
                Utils.JUTSU_337_TITLE,
                Utils.JUTSU_337_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/pogloschenie-chakry-schitom-lva.gif",0,
                Utils.JUTSU_338_TITLE,
                Utils.JUTSU_338_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/zheleznaya-kletka.gif",0,
                Utils.JUTSU_339_TITLE,
                Utils.JUTSU_339_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/prizyv-oruzhiya.gif",0,
                Utils.JUTSU_340_TITLE,
                Utils.JUTSU_340_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/ritual-voskresheniya.gif",R.drawable.voskresheniya,
                Utils.JUTSU_341_TITLE,
                Utils.JUTSU_341_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/vihr-pavlina-krugovorot.gif",0,
                Utils.JUTSU_342_TITLE,
                Utils.JUTSU_342_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/kope-shukaku.gif",0,
                Utils.JUTSU_343_TITLE,
                Utils.JUTSU_343_BODY));
        jutsuItems.add(new JutsuItem("https://jut.su/gif/peschanaya-lavina.gif",R.drawable.seal_inconcent,
                Utils.JUTSU_344_TITLE,
                Utils.JUTSU_344_BODY));




        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter =  new JutsuAdapter(jutsuItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }


}
