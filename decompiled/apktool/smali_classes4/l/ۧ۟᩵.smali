.class public final Ll/ۧ۟᩵;
.super Ll/ۖ۟᩵;
.source "N3OT"


# static fields
.field public static final ۜ:Ll/ܰܰ᩵;

.field public static final ܳ:[B

.field public static final ܿ:[B

.field public static final ᩷:Ll/ܰܰ᩵;

.field public static final ᩻:[B


# instance fields
.field public final ֫:Ll/ۨܽ֡;

.field public ۧ:J

.field public final ܽ:Ll/ܰܰ᩵;

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "multipart/mixed"

    .line 35
    invoke-static {v0}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object v0

    sput-object v0, Ll/ۧ۟᩵;->᩷:Ll/ܰܰ᩵;

    const-string v0, "multipart/alternative"

    .line 42
    invoke-static {v0}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    const-string v0, "multipart/digest"

    .line 49
    invoke-static {v0}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    const-string v0, "multipart/parallel"

    .line 55
    invoke-static {v0}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    const-string v0, "multipart/form-data"

    .line 62
    invoke-static {v0}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object v0

    sput-object v0, Ll/ۧ۟᩵;->ۜ:Ll/ܰܰ᩵;

    const/4 v0, 0x2

    new-array v1, v0, [B

    .line 64
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۧ۟᩵;->ܿ:[B

    new-array v1, v0, [B

    .line 65
    fill-array-data v1, :array_1

    sput-object v1, Ll/ۧ۟᩵;->ܳ:[B

    new-array v0, v0, [B

    .line 66
    fill-array-data v0, :array_2

    sput-object v0, Ll/ۧ۟᩵;->᩻:[B

    return-void

    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Ll/ۨܽ֡;Ll/ܰܰ᩵;Ljava/util/ArrayList;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 72
    iput-wide v0, p0, Ll/ۧ۟᩵;->ۧ:J

    .line 75
    iput-object p1, p0, Ll/ۧ۟᩵;->֫:Ll/ۨܽ֡;

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ۟᩵;->ܽ:Ll/ܰܰ᩵;

    .line 78
    invoke-static {p3}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ۟᩵;->ᩳ:Ljava/util/List;

    return-void
.end method

.method private ֫(Ll/ۤܽ֡;Z)J
    .locals 17

    move-object/from16 v0, p0

    if-eqz p2, :cond_0

    .line 129
    new-instance v1, Ll/۫ܽ֡;

    invoke-direct {v1}, Ll/۫ܽ֡;-><init>()V

    move-object v2, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move-object v2, v1

    move-object/from16 v1, p1

    .line 132
    :goto_0
    iget-object v3, v0, Ll/ۧ۟᩵;->ᩳ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    :goto_1
    iget-object v9, v0, Ll/ۧ۟᩵;->֫:Ll/ۨܽ֡;

    sget-object v10, Ll/ۧ۟᩵;->᩻:[B

    sget-object v11, Ll/ۧ۟᩵;->ܳ:[B

    if-ge v8, v4, :cond_6

    .line 133
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/֫۟᩵;

    .line 134
    iget-object v13, v12, Ll/֫۟᩵;->ۧ:Ll/ۤܰ᩵;

    .line 135
    iget-object v12, v12, Ll/֫۟᩵;->֫:Ll/ۖ۟᩵;

    .line 137
    invoke-interface {v1, v10}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    .line 138
    invoke-interface {v1, v9}, Ll/ۤܽ֡;->֫(Ll/ۨܽ֡;)Ll/ۤܽ֡;

    .line 139
    invoke-interface {v1, v11}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    .line 142
    invoke-virtual {v13}, Ll/ۤܰ᩵;->ۧ()I

    move-result v9

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_1

    .line 143
    invoke-virtual {v13, v10}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v1, v14}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    move-result-object v14

    sget-object v15, Ll/ۧ۟᩵;->ܿ:[B

    .line 144
    invoke-interface {v14, v15}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    move-result-object v14

    .line 145
    invoke-virtual {v13, v10}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    move-result-object v14

    .line 146
    invoke-interface {v14, v11}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 150
    :cond_1
    check-cast v12, Ll/ܺ۟᩵;

    iget v9, v12, Ll/ܺ۟᩵;->֫:I

    .line 90
    iget-object v10, v12, Ll/ܺ۟᩵;->ܽ:Ll/ܰܰ᩵;

    if-eqz v10, :cond_2

    const-string v13, "Content-Type: "

    .line 152
    invoke-interface {v1, v13}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    move-result-object v13

    .line 153
    invoke-virtual {v10}, Ll/ܰܰ᩵;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v13, v10}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    move-result-object v10

    .line 154
    invoke-interface {v10, v11}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    :cond_2
    int-to-long v13, v9

    const-wide/16 v15, -0x1

    cmp-long v10, v13, v15

    if-eqz v10, :cond_3

    const-string v10, "Content-Length: "

    .line 159
    invoke-interface {v1, v10}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    move-result-object v10

    .line 160
    invoke-interface {v10, v13, v14}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    move-result-object v10

    .line 161
    invoke-interface {v10, v11}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    goto :goto_3

    :cond_3
    if-eqz p2, :cond_4

    .line 164
    invoke-virtual {v2}, Ll/۫ܽ֡;->֫()V

    return-wide v15

    .line 168
    :cond_4
    :goto_3
    invoke-interface {v1, v11}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    if-eqz p2, :cond_5

    add-long/2addr v6, v13

    goto :goto_4

    .line 98
    :cond_5
    iget-object v10, v12, Ll/ܺ۟᩵;->ۧ:[B

    invoke-interface {v1, v5, v9, v10}, Ll/ۤܽ֡;->ᩳ(II[B)Ll/ۤܽ֡;

    .line 176
    :goto_4
    invoke-interface {v1, v11}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 179
    :cond_6
    invoke-interface {v1, v10}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    .line 180
    invoke-interface {v1, v9}, Ll/ۤܽ֡;->֫(Ll/ۨܽ֡;)Ll/ۤܽ֡;

    .line 181
    invoke-interface {v1, v10}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    .line 182
    invoke-interface {v1, v11}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    if-eqz p2, :cond_7

    .line 185
    invoke-virtual {v2}, Ll/۫ܽ֡;->size()J

    move-result-wide v3

    add-long/2addr v3, v6

    .line 186
    invoke-virtual {v2}, Ll/۫ܽ֡;->֫()V

    return-wide v3

    :cond_7
    return-wide v6
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 5

    const/16 v0, 0x22

    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 204
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 205
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_2

    const/16 v4, 0xd

    if-eq v3, v4, :cond_1

    if-eq v3, v0, :cond_0

    .line 217
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v3, "%22"

    .line 214
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v3, "%0D"

    .line 211
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "%0A"

    .line 208
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 221
    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 5

    .line 108
    iget-wide v0, p0, Ll/ۧ۟᩵;->ۧ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    return-wide v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 110
    invoke-direct {p0, v0, v1}, Ll/ۧ۟᩵;->֫(Ll/ۤܽ֡;Z)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۧ۟᩵;->ۧ:J

    return-wide v0
.end method

.method public final ֫(Ll/ۤܽ֡;)V
    .locals 1

    const/4 v0, 0x0

    .line 114
    invoke-direct {p0, p1, v0}, Ll/ۧ۟᩵;->֫(Ll/ۤܽ֡;Z)J

    return-void
.end method

.method public final ܽ()Ll/ܰܰ᩵;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۧ۟᩵;->ܽ:Ll/ܰܰ᩵;

    return-object v0
.end method
