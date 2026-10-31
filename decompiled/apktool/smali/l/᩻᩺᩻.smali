.class public final Ll/᩻᩺᩻;
.super Ljava/lang/Object;
.source "W7A7"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:Ll/ۗۖܽ;

.field public ܽ:Ljava/io/OutputStream;

.field public ܿ:Ll/ۗۖܽ;

.field public ᩳ:Ll/ۗۖܽ;

.field public final synthetic ᩻:Ll/ᩴ᩺᩻;


# direct methods
.method public constructor <init>(Ll/ᩴ᩺᩻;)V
    .locals 5

    .line 1079
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻᩺᩻;->᩻:Ll/ᩴ᩺᩻;

    const/4 v0, -0x1

    .line 1070
    iput v0, p0, Ll/᩻᩺᩻;->ۧ:I

    .line 1080
    iget v0, p0, Ll/᩻᩺᩻;->֫:I

    invoke-static {p1, v0}, Ll/ᩴ᩺᩻;->֫(Ll/ᩴ᩺᩻;I)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1081
    :goto_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    const-wide/32 v2, 0x80000

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 1082
    iget v0, p0, Ll/᩻᩺᩻;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩻᩺᩻;->֫:I

    invoke-static {p1, v0}, Ll/ᩴ᩺᩻;->֫(Ll/ᩴ᩺᩻;I)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/۬ۜᩳ;)Ll/ۖ᩺᩻;
    .locals 10

    .line 1090
    invoke-virtual {p2}, Ll/۬ۜᩳ;->ܽ()I

    move-result v1

    .line 1091
    iget-object v0, p0, Ll/᩻᩺᩻;->᩻:Ll/ᩴ᩺᩻;

    iget v2, p0, Ll/᩻᩺᩻;->֫:I

    invoke-static {v0, v2}, Ll/ᩴ᩺᩻;->֫(Ll/ᩴ᩺᩻;I)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1092
    iget v2, p0, Ll/᩻᩺᩻;->ۧ:I

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v2, v4, :cond_1

    .line 1094
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v5

    long-to-int v2, v5

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    const/4 v5, 0x0

    const/high16 v6, 0x80000

    const/4 v7, 0x1

    if-lez v2, :cond_3

    add-int v8, v2, v1

    if-le v8, v6, :cond_3

    .line 1163
    iget-object v0, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1164
    iput-object v5, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    .line 1165
    iput v4, p0, Ll/᩻᩺᩻;->ۧ:I

    .line 1098
    iget v0, p0, Ll/᩻᩺᩻;->֫:I

    add-int/2addr v0, v7

    iput v0, p0, Ll/᩻᩺᩻;->֫:I

    .line 1099
    iget-object v2, p0, Ll/᩻᩺᩻;->᩻:Ll/ᩴ᩺᩻;

    invoke-static {v2, v0}, Ll/ᩴ᩺᩻;->֫(Ll/ᩴ᩺᩻;I)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 1100
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v8

    long-to-int v2, v8

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 1102
    :cond_3
    :goto_1
    iget v8, p0, Ll/᩻᩺᩻;->֫:I

    const v9, 0xffff

    if-gt v8, v9, :cond_a

    .line 1105
    iget-object v8, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    if-nez v8, :cond_4

    .line 1106
    invoke-virtual {v0, v7}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    .line 1108
    :cond_4
    iget-object v0, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    invoke-virtual {p2}, Ll/۬ۜᩳ;->ۧ()[B

    move-result-object p2

    invoke-virtual {v0, p2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 1109
    iget-object p2, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V

    .line 1110
    iget-object p2, p0, Ll/᩻᩺᩻;->᩻:Ll/ᩴ᩺᩻;

    invoke-static {p2}, Ll/ᩴ᩺᩻;->֫(Ll/ᩴ᩺᩻;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    monitor-enter v0

    .line 1111
    :try_start_0
    iget-object p2, p0, Ll/᩻᩺᩻;->᩻:Ll/ᩴ᩺᩻;

    invoke-static {p2}, Ll/ᩴ᩺᩻;->ۧ(Ll/ᩴ᩺᩻;)Ljava/util/HashMap;

    move-result-object p2

    iget v3, p0, Ll/᩻᩺᩻;->֫:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1112
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1142
    iget-object p2, p0, Ll/᩻᩺᩻;->᩻:Ll/ᩴ᩺᩻;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v3, 0x4e20

    if-gt v0, v3, :cond_6

    .line 1143
    iget-object v0, p0, Ll/᩻᩺᩻;->ܳ:Ll/ۗۖܽ;

    if-nez v0, :cond_5

    .line 1144
    new-instance v0, Ll/ۗۖܽ;

    invoke-static {p2}, Ll/ᩴ᩺᩻;->ܿ(Ll/ᩴ᩺᩻;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p2, v7}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p2

    invoke-direct {v0, p2}, Ll/ۗۖܽ;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ll/᩻᩺᩻;->ܳ:Ll/ۗۖܽ;

    .line 1146
    :cond_5
    iget-object p2, p0, Ll/᩻᩺᩻;->ܳ:Ll/ۗۖܽ;

    goto :goto_2

    .line 1148
    :cond_6
    iget-object v0, p0, Ll/᩻᩺᩻;->ܿ:Ll/ۗۖܽ;

    if-nez v0, :cond_7

    .line 1149
    new-instance v0, Ll/ۗۖܽ;

    invoke-static {p2}, Ll/ᩴ᩺᩻;->ᩳ(Ll/ᩴ᩺᩻;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p2, v7}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p2

    invoke-direct {v0, p2}, Ll/ۗۖܽ;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ll/᩻᩺᩻;->ܿ:Ll/ۗۖܽ;

    .line 1151
    :cond_7
    iget-object p2, p0, Ll/᩻᩺᩻;->ܿ:Ll/ۗۖܽ;

    .line 1155
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v3, :cond_8

    .line 177
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-static {p2, v0}, Ll/۫ۜᩳ;->ۧ(Ljava/io/OutputStream;I)V

    .line 178
    invoke-static {p2, p1}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 185
    :cond_8
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-static {p2, v0}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 186
    invoke-static {p2, p1}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    .line 1116
    :goto_3
    iget p1, p0, Ll/᩻᩺᩻;->֫:I

    invoke-static {p2, p1}, Ll/۫ۜᩳ;->ۧ(Ljava/io/OutputStream;I)V

    .line 1117
    invoke-static {p2, v2}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 1118
    invoke-static {p2, v1}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 1119
    invoke-virtual {p2}, Ll/ۗۖܽ;->flush()V

    add-int p1, v2, v1

    .line 1121
    iput p1, p0, Ll/᩻᩺᩻;->ۧ:I

    .line 1122
    new-instance p2, Ll/ۖ᩺᩻;

    iget v0, p0, Ll/᩻᩺᩻;->֫:I

    invoke-direct {p2, v0, v2, v1}, Ll/ۖ᩺᩻;-><init>(III)V

    if-lt p1, v6, :cond_9

    add-int/2addr v0, v7

    .line 1124
    iput v0, p0, Ll/᩻᩺᩻;->֫:I

    .line 1163
    iget-object p1, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1164
    iput-object v5, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    .line 1165
    iput v4, p0, Ll/᩻᩺᩻;->ۧ:I

    :cond_9
    return-object p2

    :catchall_0
    move-exception p1

    .line 1112
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 1103
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Too many smali cache data files"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 1

    .line 1172
    iget-object v0, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1173
    iget-object v0, p0, Ll/᩻᩺᩻;->ܳ:Ll/ۗۖܽ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1174
    iget-object v0, p0, Ll/᩻᩺᩻;->ܿ:Ll/ۗۖܽ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 1175
    iget-object v0, p0, Ll/᩻᩺᩻;->ᩳ:Ll/ۗۖܽ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v0, 0x0

    .line 1176
    iput-object v0, p0, Ll/᩻᩺᩻;->ܽ:Ljava/io/OutputStream;

    .line 1177
    iput-object v0, p0, Ll/᩻᩺᩻;->ܳ:Ll/ۗۖܽ;

    .line 1178
    iput-object v0, p0, Ll/᩻᩺᩻;->ܿ:Ll/ۗۖܽ;

    .line 1179
    iput-object v0, p0, Ll/᩻᩺᩻;->ᩳ:Ll/ۗۖܽ;

    const/4 v0, -0x1

    .line 1180
    iput v0, p0, Ll/᩻᩺᩻;->ۧ:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 1134
    iget-object v0, p0, Ll/᩻᩺᩻;->ᩳ:Ll/ۗۖܽ;

    if-nez v0, :cond_0

    .line 1135
    new-instance v0, Ll/ۗۖܽ;

    iget-object v1, p0, Ll/᩻᩺᩻;->᩻:Ll/ᩴ᩺᩻;

    invoke-static {v1}, Ll/ᩴ᩺᩻;->ܽ(Ll/ᩴ᩺᩻;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۗۖܽ;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ll/᩻᩺᩻;->ᩳ:Ll/ۗۖܽ;

    .line 1137
    :cond_0
    iget-object v0, p0, Ll/᩻᩺᩻;->ᩳ:Ll/ۗۖܽ;

    .line 185
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-static {v0, v1}, Ll/۫ۜᩳ;->֫(Ljava/io/OutputStream;I)V

    .line 186
    invoke-static {v0, p1}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    .line 1138
    iget-object p1, p0, Ll/᩻᩺᩻;->ᩳ:Ll/ۗۖܽ;

    invoke-virtual {p1}, Ll/ۗۖܽ;->flush()V

    return-void
.end method
