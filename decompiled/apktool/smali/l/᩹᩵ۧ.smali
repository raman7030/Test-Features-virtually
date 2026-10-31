.class public final Ll/᩹᩵ۧ;
.super Ljava/lang/Object;
.source "B8Q6"

# interfaces
.implements Ll/ۢᩴۧ;


# instance fields
.field public final ֫:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/᩹᩵ۧ;->֫:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final synthetic reset()V
    .locals 0

    return-void
.end method

.method public final synthetic ֫(II[B)Ll/ܰۘۧ;
    .locals 0

    .line 0
    invoke-static {p0, p3, p2}, Ll/ܳᩴۧ;->֫(Ll/ۢᩴۧ;[BI)Ll/ܰۘۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    .locals 9

    add-int/2addr p3, p2

    .line 76
    iget-object p4, p0, Ll/᩹᩵ۧ;->֫:Ll/ᩳ֨֫;

    invoke-virtual {p4, p3, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 77
    invoke-virtual {p4, p2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 78
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 79
    :goto_0
    invoke-virtual {p4}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lez p1, :cond_8

    .line 83
    invoke-virtual {p4}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    const/16 p2, 0x8

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    const-string p3, "Incomplete Mp4Webvtt Top Level box header found."

    .line 82
    invoke-static {p3, p1}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 85
    invoke-virtual {p4}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    .line 86
    invoke-virtual {p4}, Ll/ᩳ֨֫;->᩻()I

    move-result p3

    const v0, 0x76747463

    if-ne p3, v0, :cond_7

    add-int/lit8 p1, p1, -0x8

    const/4 p3, 0x0

    move-object v0, p3

    move-object v1, v0

    :cond_1
    :goto_2
    if-lez p1, :cond_4

    if-lt p1, p2, :cond_2

    const/4 v2, 0x1

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    :goto_3
    const-string v3, "Incomplete vtt cue box header found."

    .line 102
    invoke-static {v3, v2}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 104
    invoke-virtual {p4}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    .line 105
    invoke-virtual {p4}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    add-int/lit8 p1, p1, -0x8

    sub-int/2addr v2, p2

    .line 109
    invoke-virtual {p4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-virtual {p4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    sget-object v7, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1065
    new-instance v7, Ljava/lang/String;

    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v7, v4, v6, v2, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 110
    invoke-virtual {p4, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    sub-int/2addr p1, v2

    const v2, 0x73747467

    if-ne v3, v2, :cond_3

    .line 113
    invoke-static {v7}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;)Ll/᩹֡֫;

    move-result-object v1

    goto :goto_2

    :cond_3
    const v2, 0x7061796c

    if-ne v3, v2, :cond_1

    .line 117
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 116
    invoke-static {p3, v0, v2}, Ll/᩺᩵ۧ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    move-result-object v0

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    const-string v0, ""

    :cond_5
    if-eqz v1, :cond_6

    .line 126
    invoke-virtual {v1, v0}, Ll/᩹֡֫;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p1

    goto :goto_4

    .line 127
    :cond_6
    sget-object p1, Ll/᩺᩵ۧ;->֫:Ljava/util/regex/Pattern;

    .line 238
    new-instance p1, Ll/ۨ᩵ۧ;

    invoke-direct {p1}, Ll/ۨ᩵ۧ;-><init>()V

    .line 239
    iput-object v0, p1, Ll/ۨ᩵ۧ;->᩷:Ljava/lang/CharSequence;

    .line 240
    invoke-virtual {p1}, Ll/ۨ᩵ۧ;->֫()Ll/᩹֡֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩹֡֫;->֫()Ll/᩶֡֫;

    move-result-object p1

    .line 88
    :goto_4
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    add-int/lit8 p1, p1, -0x8

    .line 91
    invoke-virtual {p4, p1}, Ll/ᩳ֨֫;->ܳ(I)V

    goto/16 :goto_0

    .line 94
    :cond_8
    new-instance p1, Ll/۬ۘۧ;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    invoke-interface {p5, p1}, Ll/᩻ۚ֫;->accept(Ljava/lang/Object;)V

    return-void
.end method
