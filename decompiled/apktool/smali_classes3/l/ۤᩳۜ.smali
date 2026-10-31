.class public final Ll/ۤᩳۜ;
.super Ljava/lang/Object;
.source "S776"

# interfaces
.implements Ll/ܰܿܽ;


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ۧۘܽ;

.field public final ܽ:Ljava/util/ArrayList;

.field public final ᩳ:Ll/᩹ᩳۜ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1080
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1072
    new-instance v0, Ll/ۧۘܽ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۧۘܽ;-><init>(Z)V

    iput-object v0, p0, Ll/ۤᩳۜ;->ۧ:Ll/ۧۘܽ;

    .line 1074
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ۤᩳۜ;->ܽ:Ljava/util/ArrayList;

    .line 1081
    new-instance v1, Ll/᩹ᩳۜ;

    invoke-direct {v1}, Ll/᩹ᩳۜ;-><init>()V

    iput-object v1, p0, Ll/ۤᩳۜ;->ᩳ:Ll/᩹ᩳۜ;

    .line 1082
    invoke-virtual {v0, v1}, Ll/ۧۘܽ;->setOutput(Ljava/io/Writer;)V

    const-string v1, "http://xmlpull.org/v1/doc/features.html#indent-output"

    const/4 v2, 0x0

    .line 1084
    invoke-virtual {v0, v1, v2}, Ll/ۧۘܽ;->setFeature(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final text(Ljava/lang/String;)V
    .locals 1

    .line 1115
    iget-object v0, p0, Ll/ۤᩳۜ;->ۧ:Ll/ۧۘܽ;

    invoke-virtual {v0, p1}, Ll/ۧۘܽ;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 1099
    iget-object v0, p0, Ll/ۤᩳۜ;->ۧ:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ۧۘܽ;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 0
    iget-object p1, p0, Ll/ۤᩳۜ;->ܽ:Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    .line 1101
    iget p1, p0, Ll/ۤᩳۜ;->֫:I

    sub-int/2addr p1, v0

    iput p1, p0, Ll/ۤᩳۜ;->֫:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1106
    iget v0, p0, Ll/ۤᩳۜ;->֫:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const-string v0, "public"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "weak"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "compact"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const-string v0, "parent"

    .line 1126
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Ll/ۤᩳۜ;->ܽ:Ljava/util/ArrayList;

    const-string v3, "complex"

    if-eqz v0, :cond_3

    iget v0, p0, Ll/ۤᩳۜ;->֫:I

    if-ne v0, v1, :cond_3

    .line 0
    invoke-static {v2, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 1142
    check-cast v0, Ljava/lang/String;

    .line 1126
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1167
    invoke-static {p2}, Ll/ܰᩳۜ;->ۧ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    .line 1168
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p2}, Ll/ܰᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object p2

    goto/16 :goto_2

    :cond_3
    const-string v0, "id"

    .line 1129
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    iget v4, p0, Ll/ۤᩳۜ;->֫:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_12

    const/4 v4, 0x0

    .line 1136
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1137
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "style"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "attr"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 0
    :cond_4
    invoke-static {v2, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 1142
    check-cast v2, Ljava/lang/String;

    .line 1146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "integer"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "dynamic-reference"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "float"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "dimen"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v1, 0x9

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "color"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v1, 0x8

    goto :goto_1

    :sswitch_5
    const-string v0, "attribute"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_6
    const-string v0, "path"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_7
    const-string v0, "bool"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_8
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_9
    const-string v0, "string"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_a
    const-string v0, "reference"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_b
    const-string v0, "fraction"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :sswitch_c
    const-string v0, "dynamic-attribute"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v1, 0x0

    goto :goto_1

    :goto_0
    const/4 v1, -0x1

    :cond_11
    :goto_1
    packed-switch v1, :pswitch_data_0

    goto :goto_2

    .line 1167
    :pswitch_0
    invoke-static {p2}, Ll/ܰᩳۜ;->ۧ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    .line 1110
    :cond_12
    :goto_2
    iget-object v0, p0, Ll/ۤᩳۜ;->ۧ:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Ll/ۧۘܽ;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x729a1572 -> :sswitch_c
        -0x62923dfe -> :sswitch_b
        -0x3724c0b5 -> :sswitch_a
        -0x352a9fef -> :sswitch_9
        0xd1b -> :sswitch_8
        0x2e3aea -> :sswitch_7
        0x346425 -> :sswitch_6
        0xc7aa9c -> :sswitch_5
        0x5a72f63 -> :sswitch_4
        0x5b28f31 -> :sswitch_3
        0x5d0225c -> :sswitch_2
        0x55797f3d -> :sswitch_1
        0x74b5813e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 3

    .line 1089
    iget v0, p0, Ll/ۤᩳۜ;->֫:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۤᩳۜ;->֫:I

    .line 1090
    iget-object v0, p0, Ll/ۤᩳۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 1091
    iget-object v2, p0, Ll/ۤᩳۜ;->ۧ:Ll/ۧۘܽ;

    invoke-virtual {v2, v0, p1}, Ll/ۧۘܽ;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 1092
    iget p1, p0, Ll/ۤᩳۜ;->֫:I

    if-ne p1, v1, :cond_0

    const-string p1, "http://xmlpull.org/v1/doc/features.html#indent-output"

    .line 1093
    invoke-virtual {v2, p1, v1}, Ll/ۧۘܽ;->setFeature(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
