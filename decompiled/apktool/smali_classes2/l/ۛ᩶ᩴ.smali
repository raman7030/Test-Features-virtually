.class public final Ll/ۛ᩶ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final f:Ll/ۛ᩶ᩴ;

.field public static final g:Ll/ۛ᩶ᩴ;

.field public static final h:Ll/ۛ᩶ᩴ;


# instance fields
.field public final a:Ll/ᩳۙᩴ;

.field public final b:Ljava/util/Locale;

.field public final c:Ll/֫ۙᩴ;

.field public final d:Ll/ܿۙᩴ;

.field public final e:Ll/ۖ᩶ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    .line 740
    new-instance v0, Ll/ۙۙᩴ;

    invoke-direct {v0}, Ll/ۙۙᩴ;-><init>()V

    sget-object v1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    sget-object v2, Ll/᩻ۙᩴ;->EXCEEDS_PAD:Ll/᩻ۙᩴ;

    const/4 v3, 0x4

    const/16 v4, 0xa

    .line 741
    invoke-virtual {v0, v1, v3, v4, v2}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    const/16 v3, 0x2d

    .line 742
    invoke-virtual {v0, v3}, Ll/ۙۙᩴ;->d(C)V

    sget-object v4, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    const/4 v5, 0x2

    .line 743
    invoke-virtual {v0, v4, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 744
    invoke-virtual {v0, v3}, Ll/ۙۙᩴ;->d(C)V

    sget-object v3, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    .line 745
    invoke-virtual {v0, v3, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    sget-object v6, Ll/ܿۙᩴ;->STRICT:Ll/ܿۙᩴ;

    sget-object v7, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    .line 746
    invoke-virtual {v0, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛ᩶ᩴ;->f:Ll/ۛ᩶ᩴ;

    .line 770
    new-instance v8, Ll/ۙۙᩴ;

    invoke-direct {v8}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    sget-object v9, Ll/۠ۙᩴ;->INSENSITIVE:Ll/۠ۙᩴ;

    invoke-virtual {v8, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 772
    invoke-virtual {v8, v0}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 916
    sget-object v10, Ll/ۘۙᩴ;->e:Ll/ۘۙᩴ;

    invoke-virtual {v8, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 774
    invoke-virtual {v8, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 802
    new-instance v8, Ll/ۙۙᩴ;

    invoke-direct {v8}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v8, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 804
    invoke-virtual {v8, v0}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 805
    invoke-virtual {v8}, Ll/ۙۙᩴ;->o()V

    .line 916
    invoke-virtual {v8, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 807
    invoke-virtual {v8, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 839
    new-instance v8, Ll/ۙۙᩴ;

    invoke-direct {v8}, Ll/ۙۙᩴ;-><init>()V

    sget-object v11, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    .line 840
    invoke-virtual {v8, v11, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    const/16 v12, 0x3a

    .line 841
    invoke-virtual {v8, v12}, Ll/ۙۙᩴ;->d(C)V

    sget-object v13, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    .line 842
    invoke-virtual {v8, v13, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 843
    invoke-virtual {v8}, Ll/ۙۙᩴ;->o()V

    .line 844
    invoke-virtual {v8, v12}, Ll/ۙۙᩴ;->d(C)V

    sget-object v12, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    .line 845
    invoke-virtual {v8, v12, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 846
    invoke-virtual {v8}, Ll/ۙۙᩴ;->o()V

    sget-object v5, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    const/4 v14, 0x0

    const/16 v15, 0x9

    move-object/from16 v16, v12

    const/4 v12, 0x1

    .line 847
    invoke-virtual {v8, v5, v14, v15, v12}, Ll/ۙۙᩴ;->b(Ll/ᩴۗᩴ;IIZ)V

    const/4 v5, 0x0

    .line 848
    invoke-virtual {v8, v6, v5}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object v8

    .line 871
    new-instance v12, Ll/ۙۙᩴ;

    invoke-direct {v12}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v12, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 873
    invoke-virtual {v12, v8}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 916
    invoke-virtual {v12, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 875
    invoke-virtual {v12, v6, v5}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 902
    new-instance v12, Ll/ۙۙᩴ;

    invoke-direct {v12}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v12, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 904
    invoke-virtual {v12, v8}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 905
    invoke-virtual {v12}, Ll/ۙۙᩴ;->o()V

    .line 916
    invoke-virtual {v12, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 907
    invoke-virtual {v12, v6, v5}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 930
    new-instance v5, Ll/ۙۙᩴ;

    invoke-direct {v5}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v5, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 932
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    const/16 v0, 0x54

    .line 933
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->d(C)V

    .line 934
    invoke-virtual {v5, v8}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 935
    invoke-virtual {v5, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object v0

    .line 960
    new-instance v5, Ll/ۙۙᩴ;

    invoke-direct {v5}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v5, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 962
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 351
    sget-object v8, Ll/۠ۙᩴ;->LENIENT:Ll/۠ۙᩴ;

    invoke-virtual {v5, v8}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 916
    invoke-virtual {v5, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 332
    sget-object v12, Ll/۠ۙᩴ;->STRICT:Ll/۠ۙᩴ;

    invoke-virtual {v5, v12}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 966
    invoke-virtual {v5, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object v5

    sput-object v5, Ll/ۛ᩶ᩴ;->g:Ll/ۛ᩶ᩴ;

    .line 994
    new-instance v14, Ll/ۙۙᩴ;

    invoke-direct {v14}, Ll/ۙۙᩴ;-><init>()V

    .line 995
    invoke-virtual {v14, v5}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 996
    invoke-virtual {v14}, Ll/ۙۙᩴ;->o()V

    const/16 v5, 0x5b

    .line 997
    invoke-virtual {v14, v5}, Ll/ۙۙᩴ;->d(C)V

    .line 293
    sget-object v5, Ll/۠ۙᩴ;->SENSITIVE:Ll/۠ۙᩴ;

    invoke-virtual {v14, v5}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1136
    new-instance v15, Ll/᩹ۙᩴ;

    move-object/from16 v17, v13

    sget-object v13, Ll/ۙۙᩴ;->h:Ll/ۡ֨ᩴ;

    move-object/from16 v18, v11

    const-string v11, "ZoneRegionId()"

    invoke-direct {v15, v13, v11}, Ll/᩹ۙᩴ;-><init>(Ll/ۡ֨ᩴ;Ljava/lang/String;)V

    invoke-virtual {v14, v15}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    const/16 v15, 0x5d

    .line 1000
    invoke-virtual {v14, v15}, Ll/ۙۙᩴ;->d(C)V

    .line 1001
    invoke-virtual {v14, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 1035
    new-instance v14, Ll/ۙۙᩴ;

    invoke-direct {v14}, Ll/ۙۙᩴ;-><init>()V

    .line 1036
    invoke-virtual {v14, v0}, Ll/ۙۙᩴ;->a(Ll/ۛ᩶ᩴ;)V

    .line 1037
    invoke-virtual {v14}, Ll/ۙۙᩴ;->o()V

    .line 916
    invoke-virtual {v14, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1039
    invoke-virtual {v14}, Ll/ۙۙᩴ;->o()V

    const/16 v0, 0x5b

    .line 1040
    invoke-virtual {v14, v0}, Ll/ۙۙᩴ;->d(C)V

    .line 293
    invoke-virtual {v14, v5}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1136
    new-instance v0, Ll/᩹ۙᩴ;

    invoke-direct {v0, v13, v11}, Ll/᩹ۙᩴ;-><init>(Ll/ۡ֨ᩴ;Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1043
    invoke-virtual {v14, v15}, Ll/ۙۙᩴ;->d(C)V

    .line 1044
    invoke-virtual {v14, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 1077
    new-instance v0, Ll/ۙۙᩴ;

    invoke-direct {v0}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v0, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    const/4 v5, 0x4

    const/16 v11, 0xa

    .line 1079
    invoke-virtual {v0, v1, v5, v11, v2}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    const/16 v5, 0x2d

    .line 1080
    invoke-virtual {v0, v5}, Ll/ۙۙᩴ;->d(C)V

    sget-object v5, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    const/4 v11, 0x3

    .line 1081
    invoke-virtual {v0, v5, v11}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 1082
    invoke-virtual {v0}, Ll/ۙۙᩴ;->o()V

    .line 916
    invoke-virtual {v0, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1084
    invoke-virtual {v0, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 1121
    new-instance v0, Ll/ۙۙᩴ;

    invoke-direct {v0}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v0, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1122
    sget-object v5, Ll/᩹ۗᩴ;->c:Ll/ܶۗᩴ;

    const/4 v11, 0x4

    const/16 v13, 0xa

    .line 1123
    invoke-virtual {v0, v5, v11, v13, v2}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    const-string v2, "-W"

    .line 1124
    invoke-virtual {v0, v2}, Ll/ۙۙᩴ;->e(Ljava/lang/String;)V

    sget-object v2, Ll/᩹ۗᩴ;->b:Ll/ܶۗᩴ;

    const/4 v5, 0x2

    .line 1125
    invoke-virtual {v0, v2, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    const/16 v2, 0x2d

    .line 1126
    invoke-virtual {v0, v2}, Ll/ۙۙᩴ;->d(C)V

    sget-object v2, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    const/4 v5, 0x1

    .line 1127
    invoke-virtual {v0, v2, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 1128
    invoke-virtual {v0}, Ll/ۙۙᩴ;->o()V

    .line 916
    invoke-virtual {v0, v10}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1130
    invoke-virtual {v0, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 1166
    new-instance v0, Ll/ۙۙᩴ;

    invoke-direct {v0}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v0, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 856
    new-instance v5, Ll/ۢۙᩴ;

    .line 3407
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 856
    invoke-virtual {v0, v5}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    const/4 v5, 0x0

    .line 1169
    invoke-virtual {v0, v6, v5}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛ᩶ᩴ;->h:Ll/ۛ᩶ᩴ;

    .line 1203
    new-instance v0, Ll/ۙۙᩴ;

    invoke-direct {v0}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v0, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    const/4 v5, 0x4

    .line 1205
    invoke-virtual {v0, v1, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    const/4 v5, 0x2

    .line 1206
    invoke-virtual {v0, v4, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 1207
    invoke-virtual {v0, v3, v5}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 1208
    invoke-virtual {v0}, Ll/ۙۙᩴ;->o()V

    .line 351
    invoke-virtual {v0, v8}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    const-string v5, "+HHMMss"

    const-string v10, "Z"

    .line 1210
    invoke-virtual {v0, v5, v10}, Ll/ۙۙᩴ;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    invoke-virtual {v0, v12}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1212
    invoke-virtual {v0, v6, v7}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    .line 1263
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-wide/16 v5, 0x1

    .line 1264
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "Mon"

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v10, 0x2

    .line 1265
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v10, "Tue"

    invoke-virtual {v0, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v10, 0x3

    .line 1266
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v11, "Wed"

    invoke-virtual {v0, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v11, 0x4

    .line 1267
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v12, "Thu"

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v12, 0x5

    .line 1268
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    const-string v13, "Fri"

    invoke-virtual {v0, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v13, 0x6

    .line 1269
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const-string v14, "Sat"

    invoke-virtual {v0, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v14, 0x7

    .line 1270
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    const-string v15, "Sun"

    invoke-virtual {v0, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1271
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    move-object/from16 v19, v7

    const-string v7, "Jan"

    .line 1272
    invoke-virtual {v15, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Feb"

    .line 1273
    invoke-virtual {v15, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Mar"

    .line 1274
    invoke-virtual {v15, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Apr"

    .line 1275
    invoke-virtual {v15, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "May"

    .line 1276
    invoke-virtual {v15, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Jun"

    .line 1277
    invoke-virtual {v15, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Jul"

    .line 1278
    invoke-virtual {v15, v14, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v5, 0x8

    .line 1279
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "Aug"

    invoke-virtual {v15, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v5, 0x9

    .line 1280
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "Sep"

    invoke-virtual {v15, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v5, 0xa

    .line 1281
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "Oct"

    invoke-virtual {v15, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v5, 0xb

    .line 1282
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "Nov"

    invoke-virtual {v15, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v5, 0xc

    .line 1283
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "Dec"

    invoke-virtual {v15, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1284
    new-instance v5, Ll/ۙۙᩴ;

    invoke-direct {v5}, Ll/ۙۙᩴ;-><init>()V

    .line 313
    invoke-virtual {v5, v9}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 351
    invoke-virtual {v5, v8}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    .line 1287
    invoke-virtual {v5}, Ll/ۙۙᩴ;->o()V

    .line 1288
    invoke-virtual {v5, v2, v0}, Ll/ۙۙᩴ;->h(Ll/ᩴۗᩴ;Ljava/util/Map;)V

    const-string v0, ", "

    .line 1289
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->e(Ljava/lang/String;)V

    .line 1290
    invoke-virtual {v5}, Ll/ۙۙᩴ;->n()V

    sget-object v0, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    const/4 v2, 0x2

    const/4 v6, 0x1

    .line 1291
    invoke-virtual {v5, v3, v6, v2, v0}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    const/16 v0, 0x20

    .line 1292
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->d(C)V

    .line 1293
    invoke-virtual {v5, v4, v15}, Ll/ۙۙᩴ;->h(Ll/ᩴۗᩴ;Ljava/util/Map;)V

    .line 1294
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->d(C)V

    const/4 v3, 0x4

    .line 1295
    invoke-virtual {v5, v1, v3}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 1296
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->d(C)V

    move-object/from16 v1, v18

    .line 1297
    invoke-virtual {v5, v1, v2}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    const/16 v1, 0x3a

    .line 1298
    invoke-virtual {v5, v1}, Ll/ۙۙᩴ;->d(C)V

    move-object/from16 v3, v17

    .line 1299
    invoke-virtual {v5, v3, v2}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 1300
    invoke-virtual {v5}, Ll/ۙۙᩴ;->o()V

    .line 1301
    invoke-virtual {v5, v1}, Ll/ۙۙᩴ;->d(C)V

    move-object/from16 v1, v16

    .line 1302
    invoke-virtual {v5, v1, v2}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    .line 1303
    invoke-virtual {v5}, Ll/ۙۙᩴ;->n()V

    .line 1304
    invoke-virtual {v5, v0}, Ll/ۙۙᩴ;->d(C)V

    const-string v0, "+HHMM"

    const-string v1, "GMT"

    .line 1305
    invoke-virtual {v5, v0, v1}, Ll/ۙۙᩴ;->g(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ll/ܿۙᩴ;->SMART:Ll/ܿۙᩴ;

    move-object/from16 v1, v19

    .line 1306
    invoke-virtual {v5, v0, v1}, Ll/ۙۙᩴ;->p(Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۙᩴ;Ljava/util/Locale;Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)V
    .locals 2

    sget-object v0, Ll/֫ۙᩴ;->a:Ll/֫ۙᩴ;

    .line 1417
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "printerParser"

    .line 1418
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۙᩴ;

    iput-object p1, p0, Ll/ۛ᩶ᩴ;->a:Ll/ᩳۙᩴ;

    const-string p1, "locale"

    .line 1420
    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Locale;

    iput-object p1, p0, Ll/ۛ᩶ᩴ;->b:Ljava/util/Locale;

    const-string p1, "decimalStyle"

    .line 1421
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ۙᩴ;

    iput-object p1, p0, Ll/ۛ᩶ᩴ;->c:Ll/֫ۙᩴ;

    const-string p1, "resolverStyle"

    .line 1422
    invoke-static {p3, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿۙᩴ;

    iput-object p1, p0, Ll/ۛ᩶ᩴ;->d:Ll/ܿۙᩴ;

    .line 1423
    iput-object p4, p0, Ll/ۛ᩶ᩴ;->e:Ll/ۖ᩶ᩴ;

    return-void
.end method

.method public static ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ll/ۛ᩶ᩴ;
    .locals 18

    move-object/from16 v0, p0

    .line 587
    new-instance v1, Ll/ۙۙᩴ;

    invoke-direct {v1}, Ll/ۙۙᩴ;-><init>()V

    const-string v2, "pattern"

    .line 1717
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1723
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_56

    .line 1724
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x7a

    const/16 v6, 0x61

    const/16 v7, 0x5a

    const/16 v8, 0x41

    const/4 v9, 0x1

    if-lt v4, v8, :cond_0

    if-le v4, v7, :cond_1

    :cond_0
    if-lt v4, v6, :cond_4c

    if-gt v4, v5, :cond_4c

    :cond_1
    add-int/lit8 v10, v3, 0x1

    .line 1727
    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_2

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v4, :cond_2

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    sub-int v3, v10, v3

    const/16 v11, 0x70

    const/4 v12, -0x1

    if-ne v4, v11, :cond_9

    .line 1732
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_6

    .line 1733
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v8, :cond_3

    if-le v4, v7, :cond_4

    :cond_3
    if-lt v4, v6, :cond_6

    if-gt v4, v5, :cond_6

    :cond_4
    add-int/lit8 v11, v10, 0x1

    .line 1737
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v13

    if-ge v11, v13, :cond_5

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v13, v4, :cond_5

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_5
    sub-int v10, v11, v10

    goto :goto_3

    :cond_6
    const/4 v11, 0x0

    move v11, v10

    move v10, v3

    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_8

    if-lt v3, v9, :cond_7

    .line 2089
    iget-object v13, v1, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iput v3, v13, Ll/ۙۙᩴ;->e:I

    const/16 v3, 0x20

    .line 2090
    iput-char v3, v13, Ll/ۙۙᩴ;->f:C

    .line 2091
    iput v12, v13, Ll/ۙۙᩴ;->g:I

    goto :goto_4

    .line 2087
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The pad width must be at least one but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1742
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Pad letter \'p\' must be followed by valid pad pattern: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    move v11, v10

    move v10, v3

    .line 1748
    :goto_4
    sget-object v3, Ll/ۙۙᩴ;->i:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۗᩴ;

    const/4 v12, 0x5

    const/4 v13, 0x2

    const-string v14, "Too many pattern letters: "

    const/4 v15, 0x4

    if-eqz v3, :cond_2e

    const/16 v5, 0x13

    if-eq v4, v8, :cond_2d

    const/16 v7, 0x51

    const/4 v8, 0x3

    if-eq v4, v7, :cond_22

    const/16 v7, 0x53

    if-eq v4, v7, :cond_21

    if-eq v4, v6, :cond_1f

    const/16 v6, 0x6b

    if-eq v4, v6, :cond_1c

    const/16 v6, 0x71

    if-eq v4, v6, :cond_1b

    const/16 v6, 0x73

    if-eq v4, v6, :cond_1c

    const/16 v6, 0x75

    if-eq v4, v6, :cond_15

    const/16 v6, 0x79

    if-eq v4, v6, :cond_15

    const/16 v6, 0x67

    if-eq v4, v6, :cond_14

    const/16 v6, 0x68

    if-eq v4, v6, :cond_1c

    const/16 v6, 0x6d

    if-eq v4, v6, :cond_1c

    const/16 v6, 0x6e

    if-eq v4, v6, :cond_2d

    packed-switch v4, :pswitch_data_0

    packed-switch v4, :pswitch_data_1

    packed-switch v4, :pswitch_data_2

    if-ne v10, v9, :cond_13

    .line 1990
    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->k(Ll/ۤۗᩴ;)V

    goto/16 :goto_11

    :pswitch_0
    if-eq v10, v9, :cond_c

    if-eq v10, v13, :cond_c

    if-eq v10, v8, :cond_c

    if-eq v10, v15, :cond_b

    if-ne v10, v12, :cond_a

    .line 1940
    sget-object v4, Ll/᩷ۙᩴ;->NARROW:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    .line 1943
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1937
    :cond_b
    sget-object v4, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    .line 1934
    :cond_c
    sget-object v4, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    :pswitch_1
    if-ne v10, v9, :cond_d

    .line 1951
    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->k(Ll/ۤۗᩴ;)V

    goto/16 :goto_11

    .line 1953
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    if-ne v10, v9, :cond_e

    .line 1973
    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->k(Ll/ۤۗᩴ;)V

    goto/16 :goto_11

    :cond_e
    if-eq v10, v13, :cond_10

    if-ne v10, v8, :cond_f

    goto :goto_5

    .line 1977
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1975
    :cond_10
    :goto_5
    sget-object v4, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    invoke-virtual {v1, v3, v10, v8, v4}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    goto/16 :goto_11

    :pswitch_3
    if-ne v10, v9, :cond_11

    .line 1880
    new-instance v12, Ll/᩸ۙᩴ;

    const/4 v8, 0x0

    move-object v3, v12

    move v5, v10

    move v6, v10

    move v7, v10

    .line 4848
    invoke-direct/range {v3 .. v8}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    .line 1880
    invoke-virtual {v1, v12}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    goto/16 :goto_11

    :cond_11
    if-eq v10, v13, :cond_12

    goto/16 :goto_7

    .line 1883
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid pattern \"cc\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1992
    :cond_13
    invoke-virtual {v1, v3, v10}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    goto/16 :goto_11

    .line 1981
    :cond_14
    sget-object v4, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    invoke-virtual {v1, v3, v10, v5, v4}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    goto/16 :goto_11

    :cond_15
    if-ne v10, v13, :cond_19

    .line 1871
    sget-object v4, Ll/֨ۙᩴ;->h:Ll/ᩴ᩹ᩴ;

    const-string v5, "field"

    .line 626
    invoke-static {v3, v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v5, "baseDate"

    .line 627
    invoke-static {v4, v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 628
    new-instance v5, Ll/֨ۙᩴ;

    const/16 v17, 0x0

    const/4 v14, 0x2

    const/4 v6, 0x2

    move-object v12, v5

    move-object v13, v3

    move v15, v6

    move-object/from16 v16, v4

    .line 2937
    invoke-direct/range {v12 .. v17}, Ll/֨ۙᩴ;-><init>(Ll/ۤۗᩴ;IILl/۬᩹ᩴ;I)V

    if-nez v4, :cond_18

    .line 2949
    invoke-interface {v3}, Ll/ۤۗᩴ;->s()Ll/᩺ۗᩴ;

    move-result-object v3

    int-to-long v7, v2

    invoke-virtual {v3, v7, v8}, Ll/᩺ۗᩴ;->e(J)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 2952
    sget-object v3, Ll/ۖۙᩴ;->f:[J

    aget-wide v12, v3, v6

    add-long/2addr v7, v12

    const-wide/32 v3, 0x7fffffff

    cmp-long v6, v7, v3

    if-gtz v6, :cond_16

    goto :goto_6

    .line 2953
    :cond_16
    new-instance v0, Ll/ܺ᩹ᩴ;

    const-string v1, "Unable to add printer-parser as the range exceeds the capacity of an int"

    invoke-direct {v0, v1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2950
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The base value must be within the range of the field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 629
    :cond_18
    :goto_6
    invoke-virtual {v1, v5}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    goto/16 :goto_11

    :cond_19
    if-ge v10, v15, :cond_1a

    .line 1873
    sget-object v4, Ll/᩻ۙᩴ;->NORMAL:Ll/᩻ۙᩴ;

    invoke-virtual {v1, v3, v10, v5, v4}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    goto/16 :goto_11

    .line 1875
    :cond_1a
    sget-object v4, Ll/᩻ۙᩴ;->EXCEEDS_PAD:Ll/᩻ۙᩴ;

    invoke-virtual {v1, v3, v10, v5, v4}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    goto/16 :goto_11

    :cond_1b
    :goto_7
    :pswitch_4
    const/4 v5, 0x1

    goto :goto_8

    :cond_1c
    :pswitch_5
    if-ne v10, v9, :cond_1d

    .line 1964
    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->k(Ll/ۤۗᩴ;)V

    goto/16 :goto_11

    :cond_1d
    if-ne v10, v13, :cond_1e

    .line 1966
    invoke-virtual {v1, v3, v10}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    goto/16 :goto_11

    .line 1968
    :cond_1e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    if-ne v10, v9, :cond_20

    .line 1924
    sget-object v4, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    .line 1926
    :cond_20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1947
    :cond_21
    sget-object v3, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    invoke-virtual {v1, v3, v10, v10, v2}, Ll/ۙۙᩴ;->b(Ll/ᩴۗᩴ;IIZ)V

    goto/16 :goto_11

    :cond_22
    :pswitch_6
    const/4 v5, 0x0

    :goto_8
    if-eq v10, v9, :cond_29

    if-eq v10, v13, :cond_29

    if-eq v10, v8, :cond_27

    if-eq v10, v15, :cond_25

    if-ne v10, v12, :cond_24

    if-eqz v5, :cond_23

    .line 1916
    sget-object v4, Ll/᩷ۙᩴ;->NARROW_STANDALONE:Ll/᩷ۙᩴ;

    goto :goto_9

    :cond_23
    sget-object v4, Ll/᩷ۙᩴ;->NARROW:Ll/᩷ۙᩴ;

    :goto_9
    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    .line 1919
    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    if-eqz v5, :cond_26

    .line 1913
    sget-object v4, Ll/᩷ۙᩴ;->FULL_STANDALONE:Ll/᩷ۙᩴ;

    goto :goto_a

    :cond_26
    sget-object v4, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    :goto_a
    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    :cond_27
    if-eqz v5, :cond_28

    .line 1910
    sget-object v4, Ll/᩷ۙᩴ;->SHORT_STANDALONE:Ll/᩷ۙᩴ;

    goto :goto_b

    :cond_28
    sget-object v4, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    :goto_b
    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    :cond_29
    const/16 v5, 0x65

    if-ne v4, v5, :cond_2a

    .line 1898
    new-instance v12, Ll/᩸ۙᩴ;

    const/4 v8, 0x0

    move-object v3, v12

    move v5, v10

    move v6, v10

    move v7, v10

    .line 4848
    invoke-direct/range {v3 .. v8}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    .line 1898
    invoke-virtual {v1, v12}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    goto/16 :goto_11

    :cond_2a
    const/16 v5, 0x45

    if-ne v4, v5, :cond_2b

    .line 1900
    sget-object v4, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3, v4}, Ll/ۙۙᩴ;->i(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    :cond_2b
    if-ne v10, v9, :cond_2c

    .line 1903
    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->k(Ll/ۤۗᩴ;)V

    goto/16 :goto_11

    .line 1905
    :cond_2c
    invoke-virtual {v1, v3, v13}, Ll/ۙۙᩴ;->l(Ll/ۤۗᩴ;I)V

    goto/16 :goto_11

    .line 1986
    :cond_2d
    :pswitch_7
    sget-object v4, Ll/᩻ۙᩴ;->NOT_NEGATIVE:Ll/᩻ۙᩴ;

    invoke-virtual {v1, v3, v10, v5, v4}, Ll/ۙۙᩴ;->m(Ll/ۤۗᩴ;IILl/᩻ۙᩴ;)V

    goto/16 :goto_11

    :cond_2e
    if-ne v4, v5, :cond_31

    if-gt v10, v15, :cond_30

    if-ne v10, v15, :cond_2f

    .line 1755
    sget-object v3, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    .line 1229
    new-instance v4, Ll/᩶ۙᩴ;

    invoke-direct {v4, v3, v2}, Ll/᩶ۙᩴ;-><init>(Ll/᩷ۙᩴ;Z)V

    goto :goto_c

    .line 1757
    :cond_2f
    sget-object v3, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    .line 1229
    new-instance v4, Ll/᩶ۙᩴ;

    invoke-direct {v4, v3, v2}, Ll/᩶ۙᩴ;-><init>(Ll/᩷ۙᩴ;Z)V

    :goto_c
    invoke-virtual {v1, v4}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    goto/16 :goto_11

    .line 1753
    :cond_30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    const/16 v3, 0x56

    if-ne v4, v3, :cond_33

    if-ne v10, v13, :cond_32

    .line 1080
    new-instance v3, Ll/᩹ۙᩴ;

    sget-object v4, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    const-string v5, "ZoneId()"

    invoke-direct {v3, v4, v5}, Ll/᩹ۙᩴ;-><init>(Ll/ۡ֨ᩴ;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    goto/16 :goto_11

    .line 1761
    :cond_32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Pattern letter count must be 2: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    const/16 v3, 0x76

    if-ne v4, v3, :cond_36

    if-ne v10, v9, :cond_34

    .line 1766
    sget-object v3, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    .line 1311
    new-instance v4, Ll/᩶ۙᩴ;

    invoke-direct {v4, v3, v9}, Ll/᩶ۙᩴ;-><init>(Ll/᩷ۙᩴ;Z)V

    :goto_d
    invoke-virtual {v1, v4}, Ll/ۙۙᩴ;->c(Ll/ܳۙᩴ;)I

    goto/16 :goto_11

    :cond_34
    if-ne v10, v15, :cond_35

    .line 1768
    sget-object v3, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    .line 1311
    new-instance v4, Ll/᩶ۙᩴ;

    invoke-direct {v4, v3, v9}, Ll/᩶ۙᩴ;-><init>(Ll/᩷ۙᩴ;Z)V

    goto :goto_d

    .line 1770
    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong number of  pattern letters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    const-string v3, "Z"

    const-string v5, "+0000"

    if-ne v4, v7, :cond_3a

    if-ge v10, v15, :cond_37

    const-string v3, "+HHMM"

    .line 1774
    invoke-virtual {v1, v3, v5}, Ll/ۙۙᩴ;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_11

    :cond_37
    if-ne v10, v15, :cond_38

    .line 1776
    sget-object v3, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->f(Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    :cond_38
    if-ne v10, v12, :cond_39

    const-string v4, "+HH:MM:ss"

    .line 1778
    invoke-virtual {v1, v4, v3}, Ll/ۙۙᩴ;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 1780
    :cond_39
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    const/16 v6, 0x4f

    if-ne v4, v6, :cond_3d

    if-ne v10, v9, :cond_3b

    .line 1784
    sget-object v3, Ll/᩷ۙᩴ;->SHORT:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->f(Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    :cond_3b
    if-ne v10, v15, :cond_3c

    .line 1786
    sget-object v3, Ll/᩷ۙᩴ;->FULL:Ll/᩷ۙᩴ;

    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->f(Ll/᩷ۙᩴ;)V

    goto/16 :goto_11

    .line 1788
    :cond_3c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Pattern letter count must be 1 or 4: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3d
    const/16 v6, 0x58

    if-ne v4, v6, :cond_40

    if-gt v10, v12, :cond_3f

    .line 1794
    sget-object v4, Ll/ۘۙᩴ;->d:[Ljava/lang/String;

    if-ne v10, v9, :cond_3e

    const/4 v5, 0x0

    goto :goto_e

    :cond_3e
    const/4 v5, 0x1

    :goto_e
    add-int/2addr v10, v5

    aget-object v4, v4, v10

    invoke-virtual {v1, v4, v3}, Ll/ۙۙᩴ;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 1792
    :cond_3f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_40
    const/16 v3, 0x78

    if-ne v4, v3, :cond_45

    if-gt v10, v12, :cond_44

    if-ne v10, v9, :cond_41

    const-string v5, "+00"

    goto :goto_f

    .line 1799
    :cond_41
    rem-int/lit8 v3, v10, 0x2

    if-nez v3, :cond_42

    goto :goto_f

    :cond_42
    const-string v5, "+00:00"

    .line 1800
    :goto_f
    sget-object v3, Ll/ۘۙᩴ;->d:[Ljava/lang/String;

    if-ne v10, v9, :cond_43

    const/4 v4, 0x0

    goto :goto_10

    :cond_43
    const/4 v4, 0x1

    :goto_10
    add-int/2addr v10, v4

    aget-object v3, v3, v10

    invoke-virtual {v1, v3, v5}, Ll/ۙۙᩴ;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_11

    .line 1797
    :cond_44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    const/16 v3, 0x57

    if-ne v4, v3, :cond_47

    if-gt v10, v9, :cond_46

    .line 1806
    new-instance v12, Ll/᩸ۙᩴ;

    const/4 v8, 0x0

    move-object v3, v12

    move v5, v10

    move v6, v10

    move v7, v10

    .line 4848
    invoke-direct/range {v3 .. v8}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    .line 1806
    invoke-virtual {v1, v12}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    goto :goto_11

    .line 1804
    :cond_46
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_47
    const/16 v3, 0x77

    if-ne v4, v3, :cond_49

    if-gt v10, v13, :cond_48

    .line 1812
    new-instance v12, Ll/᩸ۙᩴ;

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, v12

    move v5, v10

    move v6, v10

    .line 4848
    invoke-direct/range {v3 .. v8}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    .line 1812
    invoke-virtual {v1, v12}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    goto :goto_11

    .line 1810
    :cond_48
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_49
    const/16 v3, 0x59

    if-ne v4, v3, :cond_4b

    if-ne v10, v13, :cond_4a

    .line 1816
    new-instance v12, Ll/᩸ۙᩴ;

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, v12

    move v5, v10

    move v6, v10

    .line 4848
    invoke-direct/range {v3 .. v8}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    .line 1816
    invoke-virtual {v1, v12}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    goto :goto_11

    .line 1818
    :cond_4a
    new-instance v12, Ll/᩸ۙᩴ;

    const/16 v7, 0x13

    const/4 v8, 0x0

    move-object v3, v12

    move v5, v10

    move v6, v10

    .line 4848
    invoke-direct/range {v3 .. v8}, Ll/᩸ۙᩴ;-><init>(CIIII)V

    .line 1818
    invoke-virtual {v1, v12}, Ll/ۙۙᩴ;->j(Ll/ۖۙᩴ;)V

    :goto_11
    add-int/lit8 v3, v11, -0x1

    goto/16 :goto_14

    .line 1821
    :cond_4b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown pattern letter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4c
    const-string v5, "\'"

    const/16 v6, 0x27

    if-ne v4, v6, :cond_51

    add-int/lit8 v3, v3, 0x1

    move v4, v3

    .line 1828
    :goto_12
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v4, v7, :cond_4e

    .line 1829
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_4d

    add-int/lit8 v7, v4, 0x1

    .line 1830
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v7, v8, :cond_4e

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v6, :cond_4e

    move v4, v7

    :cond_4d
    add-int/2addr v4, v9

    goto :goto_12

    .line 1837
    :cond_4e
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v4, v7, :cond_50

    .line 1840
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 1841
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_4f

    .line 1842
    invoke-virtual {v1, v6}, Ll/ۙۙᩴ;->d(C)V

    goto :goto_13

    :cond_4f
    const-string v6, "\'\'"

    .line 1844
    invoke-virtual {v3, v6, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۙۙᩴ;->e(Ljava/lang/String;)V

    :goto_13
    move v3, v4

    goto :goto_14

    .line 1838
    :cond_50
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Pattern ends with an incomplete string literal: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_51
    const/16 v6, 0x5b

    if-ne v4, v6, :cond_52

    .line 1848
    invoke-virtual {v1}, Ll/ۙۙᩴ;->o()V

    goto :goto_14

    :cond_52
    const/16 v6, 0x5d

    if-ne v4, v6, :cond_54

    .line 1851
    iget-object v4, v1, Ll/ۙۙᩴ;->a:Ll/ۙۙᩴ;

    iget-object v4, v4, Ll/ۙۙᩴ;->b:Ll/ۙۙᩴ;

    if-eqz v4, :cond_53

    .line 1854
    invoke-virtual {v1}, Ll/ۙۙᩴ;->n()V

    goto :goto_14

    .line 1852
    :cond_53
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Pattern invalid as it contains ] without previous ["

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    const/16 v6, 0x7b

    if-eq v4, v6, :cond_55

    const/16 v6, 0x7d

    if-eq v4, v6, :cond_55

    const/16 v6, 0x23

    if-eq v4, v6, :cond_55

    .line 1859
    invoke-virtual {v1, v4}, Ll/ۙۙᩴ;->d(C)V

    :goto_14
    add-int/2addr v3, v9

    goto/16 :goto_0

    .line 1857
    :cond_55
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Pattern includes reserved character: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2224
    :cond_56
    sget-object v0, Ll/ܿۙᩴ;->SMART:Ll/ܿۙᩴ;

    const/4 v2, 0x0

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v0, v2}, Ll/ۙۙᩴ;->q(Ljava/util/Locale;Ll/ܿۙᩴ;Ll/ۖ᩶ᩴ;)Ll/ۛ᩶ᩴ;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x44
        :pswitch_2
        :pswitch_6
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4b
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x63
        :pswitch_3
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)Ll/ܽۙᩴ;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1988
    new-instance v2, Ljava/text/ParsePosition;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/text/ParsePosition;-><init>(I)V

    const-string v4, "text"

    .line 2056
    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "position"

    .line 2057
    invoke-static {v2, v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2058
    new-instance v4, Ll/ۗۙᩴ;

    invoke-direct {v4, v0}, Ll/ۗۙᩴ;-><init>(Ll/ۛ᩶ᩴ;)V

    .line 2059
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v5

    .line 2060
    iget-object v6, v0, Ll/ۛ᩶ᩴ;->a:Ll/ᩳۙᩴ;

    invoke-virtual {v6, v4, v1, v5}, Ll/ᩳۙᩴ;->m(Ll/ۗۙᩴ;Ljava/lang/CharSequence;I)I

    move-result v5

    const/4 v6, 0x0

    if-gez v5, :cond_0

    not-int v4, v5

    .line 2062
    invoke-virtual {v2, v4}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    move-object v4, v6

    goto :goto_0

    .line 2065
    :cond_0
    invoke-virtual {v2, v5}, Ljava/text/ParsePosition;->setIndex(I)V

    :goto_0
    if-eqz v4, :cond_23

    .line 1990
    iget-object v5, v4, Ll/ۗۙᩴ;->a:Ll/ۛ᩶ᩴ;

    invoke-virtual {v2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v7

    if-gez v7, :cond_23

    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v7

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v7, v8, :cond_1

    goto/16 :goto_f

    .line 328
    :cond_1
    invoke-virtual {v4}, Ll/ۗۙᩴ;->c()Ll/ܽۙᩴ;

    move-result-object v1

    .line 167
    invoke-virtual {v4}, Ll/ۗۙᩴ;->c()Ll/ܽۙᩴ;

    move-result-object v2

    iget-object v2, v2, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    if-nez v2, :cond_2

    .line 1501
    iget-object v2, v5, Ll/ۛ᩶ᩴ;->e:Ll/ۖ᩶ᩴ;

    if-nez v2, :cond_2

    .line 171
    sget-object v2, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    .line 329
    :cond_2
    iput-object v2, v1, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    .line 330
    iget-object v2, v1, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    if-eqz v2, :cond_3

    move-object v6, v2

    goto :goto_1

    .line 1555
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    :goto_1
    iput-object v6, v1, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    .line 252
    iget-object v2, v0, Ll/ۛ᩶ᩴ;->d:Ll/ܿۙᩴ;

    iput-object v2, v1, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    .line 265
    invoke-virtual {v1}, Ll/ܽۙᩴ;->k()V

    .line 360
    iget-object v2, v1, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    iget-object v5, v1, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    invoke-interface {v2, v4, v5}, Ll/ۖ᩶ᩴ;->O(Ljava/util/Map;Ll/ܿۙᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܽۙᩴ;->v(Ll/۬᩹ᩴ;)V

    .line 267
    invoke-virtual {v1}, Ll/ܽۙᩴ;->q()V

    .line 271
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    if-lez v2, :cond_e

    :goto_2
    const/16 v2, 0x32

    if-ge v3, v2, :cond_c

    .line 275
    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 276
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤۗᩴ;

    .line 277
    iget-object v6, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    iget-object v7, v1, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    invoke-interface {v5, v6, v1, v7}, Ll/ۤۗᩴ;->n(Ljava/util/Map;Ll/ܽۙᩴ;Ll/ܿۙᩴ;)Ll/ۖۗᩴ;

    move-result-object v6

    if-eqz v6, :cond_b

    .line 279
    instance-of v2, v6, Ll/᩹᩹ᩴ;

    if-eqz v2, :cond_7

    .line 280
    check-cast v6, Ll/᩹᩹ᩴ;

    .line 281
    iget-object v2, v1, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    if-nez v2, :cond_5

    .line 282
    invoke-interface {v6}, Ll/᩹᩹ᩴ;->F()Ll/ۚ᩹ᩴ;

    move-result-object v2

    iput-object v2, v1, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    goto :goto_3

    .line 283
    :cond_5
    invoke-interface {v6}, Ll/᩹᩹ᩴ;->F()Ll/ۚ᩹ᩴ;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ۚ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 286
    :goto_3
    invoke-interface {v6}, Ll/᩹᩹ᩴ;->t()Ll/ܰ᩹ᩴ;

    move-result-object v6

    goto :goto_4

    .line 284
    :cond_6
    new-instance v2, Ll/ܺ᩹ᩴ;

    iget-object v1, v1, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ChronoZonedDateTime must use the effective parsed zone: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v2

    .line 288
    :cond_7
    :goto_4
    instance-of v2, v6, Ll/ܰ᩹ᩴ;

    if-eqz v2, :cond_8

    .line 289
    check-cast v6, Ll/ܰ᩹ᩴ;

    .line 290
    invoke-interface {v6}, Ll/ܰ᩹ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object v2

    sget-object v4, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    invoke-virtual {v1, v2, v4}, Ll/ܽۙᩴ;->s(Ll/۟ۙᩴ;Ll/ۜۗᩴ;)V

    .line 291
    invoke-interface {v6}, Ll/ܰ᩹ᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܽۙᩴ;->v(Ll/۬᩹ᩴ;)V

    goto :goto_5

    .line 295
    :cond_8
    instance-of v2, v6, Ll/۬᩹ᩴ;

    if-eqz v2, :cond_9

    .line 296
    check-cast v6, Ll/۬᩹ᩴ;

    invoke-virtual {v1, v6}, Ll/ܽۙᩴ;->v(Ll/۬᩹ᩴ;)V

    goto :goto_5

    .line 300
    :cond_9
    instance-of v2, v6, Ll/۟ۙᩴ;

    if-eqz v2, :cond_a

    .line 301
    check-cast v6, Ll/۟ۙᩴ;

    sget-object v2, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    invoke-virtual {v1, v6, v2}, Ll/ܽۙᩴ;->s(Ll/۟ۙᩴ;Ll/ۜۗᩴ;)V

    goto :goto_5

    .line 305
    :cond_a
    new-instance v1, Ll/ܺ᩹ᩴ;

    const-string v2, "Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime"

    invoke-direct {v1, v2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v1

    .line 307
    :cond_b
    iget-object v6, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v6, Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2

    :cond_c
    if-eq v3, v2, :cond_d

    if-lez v3, :cond_e

    .line 319
    invoke-virtual {v1}, Ll/ܽۙᩴ;->k()V

    .line 360
    iget-object v2, v1, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    iget-object v4, v1, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    invoke-interface {v2, v3, v4}, Ll/ۖ᩶ᩴ;->O(Ljava/util/Map;Ll/ܿۙᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܽۙᩴ;->v(Ll/۬᩹ᩴ;)V

    .line 321
    invoke-virtual {v1}, Ll/ܽۙᩴ;->q()V

    goto :goto_6

    .line 315
    :cond_d
    new-instance v1, Ll/ܺ᩹ᩴ;

    const-string v2, "One of the parsed fields has an incorrectly implemented resolve method"

    invoke-direct {v1, v2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v1

    .line 489
    :cond_e
    :goto_6
    iget-object v2, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    const-wide/32 v3, 0xf4240

    const-wide/16 v5, 0x3e8

    const-wide/16 v7, 0x0

    if-nez v2, :cond_17

    .line 491
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v9, Ll/ᩴۗᩴ;->MILLI_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 492
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v9}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 493
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v12, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    mul-long v10, v10, v5

    .line 495
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    rem-long/2addr v13, v5

    add-long/2addr v13, v10

    .line 496
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v9, v12, v2}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 497
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v12}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v9, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    mul-long v13, v13, v5

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 501
    :cond_f
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v9, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    mul-long v10, v10, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 503
    :cond_10
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v9, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 505
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v9}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 506
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v11, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    mul-long v9, v9, v5

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v11, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    :cond_11
    :goto_7
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v14, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_17

    .line 512
    iget-object v9, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v15, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    check-cast v9, Ljava/util/HashMap;

    invoke-virtual {v9, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    .line 513
    iget-object v10, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v12, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    check-cast v10, Ljava/util/HashMap;

    invoke-virtual {v10, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    .line 514
    iget-object v11, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v13, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v11, Ljava/util/HashMap;

    invoke-virtual {v11, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Long;

    if-nez v9, :cond_12

    if-nez v10, :cond_19

    if-nez v11, :cond_19

    :cond_12
    if-eqz v9, :cond_13

    if-nez v10, :cond_13

    if-eqz v11, :cond_13

    goto/16 :goto_c

    :cond_13
    if-eqz v9, :cond_14

    .line 523
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    goto :goto_8

    :cond_14
    move-wide/from16 v16, v7

    :goto_8
    if-eqz v10, :cond_15

    .line 524
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    move-wide/from16 v18, v9

    goto :goto_9

    :cond_15
    move-wide/from16 v18, v7

    :goto_9
    if-eqz v11, :cond_16

    .line 525
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    move-wide/from16 v20, v9

    goto :goto_a

    :cond_16
    move-wide/from16 v20, v7

    .line 526
    :goto_a
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    move-object v9, v1

    move-object v2, v12

    move-object v3, v13

    move-wide/from16 v12, v16

    move-object v4, v14

    move-object v5, v15

    move-wide/from16 v14, v18

    move-wide/from16 v16, v20

    invoke-virtual/range {v9 .. v17}, Ll/ܽۙᩴ;->p(JJJJ)V

    .line 527
    iget-object v6, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v6, Ljava/util/HashMap;

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    :cond_17
    iget-object v2, v1, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v3, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-eq v2, v3, :cond_19

    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    if-lez v2, :cond_19

    .line 536
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_18
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 537
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤۗᩴ;

    .line 538
    instance-of v5, v4, Ll/ᩴۗᩴ;

    if-eqz v5, :cond_18

    check-cast v4, Ll/ᩴۗᩴ;

    invoke-virtual {v4}, Ll/ᩴۗᩴ;->V()Z

    move-result v5

    if-eqz v5, :cond_18

    .line 539
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ll/ᩴۗᩴ;->T(J)V

    goto :goto_b

    .line 633
    :cond_19
    :goto_c
    iget-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v2, :cond_1a

    .line 634
    invoke-virtual {v1, v2}, Ll/ܽۙᩴ;->j(Ll/ۖۗᩴ;)V

    .line 636
    :cond_1a
    iget-object v2, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v2, :cond_1b

    .line 637
    invoke-virtual {v1, v2}, Ll/ܽۙᩴ;->j(Ll/ۖۗᩴ;)V

    .line 638
    iget-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v2, :cond_1b

    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    if-lez v2, :cond_1b

    .line 639
    iget-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    iget-object v3, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    invoke-interface {v2, v3}, Ll/۬᩹ᩴ;->I(Ll/۟ۙᩴ;)Ll/ܰ᩹ᩴ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܽۙᩴ;->j(Ll/ۖۗᩴ;)V

    .line 570
    :cond_1b
    iget-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v2, :cond_1d

    iget-object v2, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v2, :cond_1d

    iget-object v2, v1, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    sget-object v3, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    if-ne v2, v3, :cond_1c

    goto :goto_d

    .line 571
    :cond_1c
    iget-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    iget-object v4, v1, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    invoke-interface {v2, v4}, Ll/۬᩹ᩴ;->N(Ll/۫ۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object v2

    iput-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    .line 572
    iput-object v3, v1, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    .line 588
    :cond_1d
    :goto_d
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 579
    iget-object v3, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-nez v3, :cond_20

    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v4, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    .line 580
    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1e

    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v4, Ll/ᩴۗᩴ;->SECOND_OF_DAY:Ll/ᩴۗᩴ;

    .line 581
    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1e

    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v4, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    .line 582
    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 583
    :cond_1e
    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v4, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1f

    .line 584
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 585
    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v5, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    const-wide/16 v6, 0x3e8

    div-long v6, v2, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v5, Ll/ᩴۗᩴ;->MILLI_OF_SECOND:Ll/ᩴۗᩴ;

    const-wide/32 v6, 0xf4240

    div-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    .line 588
    :cond_1f
    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v4, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    iget-object v3, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v4, Ll/ᩴۗᩴ;->MILLI_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    :cond_20
    :goto_e
    iget-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v2, :cond_22

    iget-object v2, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v2, :cond_22

    .line 599
    iget-object v2, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v3, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_21

    .line 601
    invoke-virtual {v2}, Ljava/lang/Long;->intValue()I

    move-result v2

    invoke-static {v2}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object v2

    .line 602
    iget-object v3, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    iget-object v4, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    invoke-interface {v3, v4}, Ll/۬᩹ᩴ;->I(Ll/۟ۙᩴ;)Ll/ܰ᩹ᩴ;

    move-result-object v3

    invoke-interface {v3, v2}, Ll/ܰ᩹ᩴ;->D(Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩹᩹ᩴ;->U()J

    move-result-wide v2

    .line 603
    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v5, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 605
    :cond_21
    iget-object v2, v1, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    if-eqz v2, :cond_22

    .line 606
    iget-object v2, v1, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    iget-object v3, v1, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    invoke-interface {v2, v3}, Ll/۬᩹ᩴ;->I(Ll/۟ۙᩴ;)Ll/ܰ᩹ᩴ;

    move-result-object v2

    iget-object v3, v1, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    invoke-interface {v2, v3}, Ll/ܰ᩹ᩴ;->D(Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩹᩹ᩴ;->U()J

    move-result-wide v2

    .line 607
    iget-object v4, v1, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v5, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_22
    return-object v1

    .line 1992
    :cond_23
    :goto_f
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/16 v5, 0x40

    if-le v4, v5, :cond_24

    .line 1993
    invoke-interface {v1, v3, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "..."

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_10

    .line 1995
    :cond_24
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1997
    :goto_10
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v4

    const-string v5, "Text \'"

    if-ltz v4, :cond_25

    .line 1998
    new-instance v4, Ll/۬ۙᩴ;

    .line 1999
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' could not be parsed at index "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/text/ParsePosition;->getErrorIndex()I

    invoke-direct {v4, v3, v1}, Ll/۬ۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    throw v4

    .line 2001
    :cond_25
    new-instance v4, Ll/۬ۙᩴ;

    .line 2002
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' could not be parsed, unparsed text found at index "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    invoke-direct {v4, v3, v1}, Ll/۬ۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    throw v4
.end method

.method public format(Ll/ۖۗᩴ;)Ljava/lang/String;
    .locals 3

    .line 1769
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1791
    iget-object v1, p0, Ll/ۛ᩶ᩴ;->a:Ll/ᩳۙᩴ;

    const-string v2, "temporal"

    invoke-static {p1, v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v2, "appendable"

    .line 1792
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1794
    :try_start_0
    new-instance v2, Ll/ۤۙᩴ;

    invoke-direct {v2, p1, p0}, Ll/ۤۙᩴ;-><init>(Ll/ۖۗᩴ;Ll/ۛ᩶ᩴ;)V

    .line 1796
    invoke-virtual {v1, v2, v0}, Ll/ᩳۙᩴ;->l(Ll/ۤۙᩴ;Ljava/lang/StringBuilder;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1771
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 1804
    new-instance v0, Ll/ܺ᩹ᩴ;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1804
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 2126
    iget-object v0, p0, Ll/ۛ᩶ᩴ;->a:Ll/ᩳۙᩴ;

    invoke-virtual {v0}, Ll/ᩳۙᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "["

    .line 2127
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
