.class public final Ll/۠֫֨;
.super Ll/ۨܽ֨;
.source "C5BI"


# static fields
.field public static final synthetic ᩷ۧ:I


# instance fields
.field public ۜۧ:Ll/ۢ֫֨;

.field public ᩻ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public static ֫(Ljava/io/DataInputStream;Ll/ۨܽ֨;Z)Ll/ۢ֫֨;
    .locals 7

    .line 58
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    int-to-char v0, v0

    .line 59
    invoke-static {v0}, Ll/ᩳۤۚ;->֫(C)Ll/۟۫ۚ;

    move-result-object v1

    .line 60
    sget-object v2, Ll/᩷֫֨;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    .line 90
    iget-boolean p0, p1, Ll/ۢܽ֨;->᩹:Z

    const/4 p2, 0x2

    const/4 v2, 0x1

    const/16 v4, 0x3f

    const-string v5, "Unknown tag in annotation \"{0}\" [0x{1}]"

    if-eqz p0, :cond_2

    .line 91
    iget-object p0, p1, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-static {v0}, Ll/ᩴۗۚ;->ۧ(C)Z

    move-result v6

    if-eqz v6, :cond_1

    move v4, v0

    goto :goto_1

    .line 82
    :pswitch_0
    new-instance v0, Ll/ܺ֫֨;

    .line 297
    invoke-direct {v0, v1, p1}, Ll/ۢ֫֨;-><init>(Ll/۟۫ۚ;Ll/ۨܽ֨;)V

    .line 294
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Ll/ܺ֫֨;->ۜۧ:Ljava/util/ArrayList;

    const-string v1, "Array_AnnotationValue"

    .line 298
    iput-object v1, v0, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    .line 84
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    move-result v1

    :goto_0
    if-ge v3, v1, :cond_0

    .line 86
    invoke-static {p0, p1, p2}, Ll/۠֫֨;->֫(Ljava/io/DataInputStream;Ll/ۨܽ֨;Z)Ll/ۢ֫֨;

    move-result-object v2

    .line 309
    iget-object v4, v0, Ll/ܺ֫֨;->ۜۧ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 76
    :pswitch_1
    new-instance v0, Ll/ۜ֫֨;

    invoke-direct {v0, p1, p2}, Ll/ۜ֫֨;-><init>(Ll/ۨܽ֨;Z)V

    .line 77
    invoke-virtual {v0, p0}, Ll/ۜ֫֨;->ۧ(Ljava/io/DataInputStream;)V

    .line 78
    new-instance p0, Ll/ۡ֫֨;

    invoke-direct {p0, v1, p1, v0}, Ll/ۡ֫֨;-><init>(Ll/۟۫ۚ;Ll/ۨܽ֨;Ll/ۜ֫֨;)V

    return-object p0

    .line 70
    :pswitch_2
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    move-result p2

    .line 71
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    move-result p0

    .line 72
    new-instance v0, Ll/ۖ֫֨;

    .line 247
    invoke-direct {v0, v1, p1}, Ll/ۢ֫֨;-><init>(Ll/۟۫ۚ;Ll/ۨܽ֨;)V

    .line 248
    iput p2, v0, Ll/ۖ֫֨;->ۜۧ:I

    .line 249
    iput p0, v0, Ll/ۖ֫֨;->᩷ۧ:I

    const-string p0, "CPX2_AnnotationValue"

    .line 250
    iput-object p0, v0, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    return-object v0

    .line 64
    :pswitch_3
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    move-result p0

    .line 65
    new-instance p2, Ll/֨֫֨;

    .line 182
    invoke-direct {p2, v1, p1}, Ll/ۢ֫֨;-><init>(Ll/۟۫ۚ;Ll/ۨܽ֨;)V

    .line 183
    iput p0, p2, Ll/֨֫֨;->ۜۧ:I

    const-string p0, "CPX_AnnotationValue"

    .line 184
    iput-object p0, p2, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    return-object p2

    .line 91
    :cond_1
    :goto_1
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    new-array p2, p2, [Ljava/lang/Object;

    aput-object v4, p2, v3

    aput-object v0, p2, v2

    invoke-virtual {p0, v5, p2}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    new-instance p0, Ll/ۡ֫֨;

    const/4 p2, 0x0

    invoke-direct {p0, v1, p1, p2}, Ll/ۡ֫֨;-><init>(Ll/۟۫ۚ;Ll/ۨܽ֨;Ll/ۜ֫֨;)V

    return-object p0

    .line 94
    :cond_2
    new-instance p0, Ll/ۙۗۚ;

    iget-object p1, p1, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {p1}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object p1

    .line 95
    invoke-static {v0}, Ll/ᩴۗۚ;->ۧ(C)Z

    move-result v1

    if-eqz v1, :cond_3

    move v4, v0

    :cond_3
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    new-array p2, p2, [Ljava/lang/Object;

    aput-object v1, p2, v3

    aput-object v0, p2, v2

    invoke-direct {p0, p1, v5, p2}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<AnnotationElement "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۠֫֨;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۠֫֨;->ۜۧ:Ll/ۢ֫֨;

    invoke-virtual {v1}, Ll/ۢ֫֨;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 3

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/۠֫֨;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Ll/۠֫֨;->ۜۧ:Ll/ۢ֫֨;

    invoke-virtual {v0, p0}, Ll/ۢܽ֨;->֫(Ll/ۨܽ֨;)V

    const/4 v1, 0x1

    .line 260
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 125
    iget-object v0, p0, Ll/۠֫֨;->ۜۧ:Ll/ۢ֫֨;

    iget-object v1, v0, Ll/ۢ֫֨;->᩻ۧ:Ll/۟۫ۚ;

    sget-object v2, Ll/۟۫ۚ;->ۗ:Ll/۟۫ۚ;

    if-ne v1, v2, :cond_1

    .line 126
    check-cast v0, Ll/ܺ֫֨;

    iget-object v0, v0, Ll/ܺ֫֨;->ۜۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "{ }"

    .line 127
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    return-void

    .line 129
    :cond_0
    invoke-virtual {p0}, Ll/ۢܽ֨;->᩵()V

    invoke-virtual {p0}, Ll/ۢܽ֨;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Ll/۠֫֨;->ۜۧ:Ll/ۢ֫֨;

    invoke-virtual {v0}, Ll/ۢ֫֨;->ۧ()V

    const-string v0, "}"

    .line 131
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    return-void

    .line 134
    :cond_1
    invoke-virtual {p0}, Ll/ۨܽ֨;->֨()Ll/ۛܽ֨;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨܽ֨;->֫(Ll/ۛܽ֨;)V

    .line 135
    iget-object v0, p0, Ll/۠֫֨;->ۜۧ:Ll/ۢ֫֨;

    invoke-virtual {v0}, Ll/ۢ֫֨;->ۧ()V

    return-void
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 5

    .line 114
    iget-object v0, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v1, p0, Ll/۠֫֨;->᩻ۧ:I

    invoke-virtual {v0, v1}, Ll/ۤۧ֨;->getName(I)Ljava/lang/String;

    move-result-object v0

    .line 115
    iget-boolean v1, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v1, :cond_1

    .line 116
    iget-boolean v1, p0, Ll/ۢܽ֨;->ܺ֫:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iget v0, p0, Ll/۠֫֨;->᩻ۧ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "#%d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget v1, p0, Ll/۠֫֨;->᩻ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    const-string v0, "#%d /* %s */"

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method
