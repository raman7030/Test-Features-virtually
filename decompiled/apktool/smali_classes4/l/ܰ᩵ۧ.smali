.class public final Ll/ܰ᩵ۧ;
.super Ljava/lang/Object;
.source "O8UA"

# interfaces
.implements Ll/ۢᩴۧ;


# instance fields
.field public final ֫:Ll/᩶᩵ۧ;

.field public final ۧ:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0}, Ll/ᩳ֨֫;-><init>()V

    iput-object v0, p0, Ll/ܰ᩵ۧ;->ۧ:Ll/ᩳ֨֫;

    .line 61
    new-instance v0, Ll/᩶᩵ۧ;

    invoke-direct {v0}, Ll/᩶᩵ۧ;-><init>()V

    iput-object v0, p0, Ll/ܰ᩵ۧ;->֫:Ll/᩶᩵ۧ;

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
    .locals 6

    add-int/2addr p3, p2

    .line 76
    iget-object v0, p0, Ll/ܰ᩵ۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v0, p3, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 77
    invoke-virtual {v0, p2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 78
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    :try_start_0
    invoke-static {v0}, Ll/۟᩵ۧ;->ܽ(Ll/ᩳ֨֫;)V
    :try_end_0
    .catch Ll/ۡ᩵֫; {:try_start_0 .. :try_end_0} :catch_0

    .line 588
    :goto_0
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p2}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p2

    .line 86
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 89
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    :goto_1
    const/4 p3, -0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_2
    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne v1, p3, :cond_5

    .line 121
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    .line 588
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    const-string v3, "STYLE"

    .line 125
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v1, 0x2

    goto :goto_2

    :cond_3
    const-string v3, "NOTE"

    .line 127
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x3

    goto :goto_2

    .line 133
    :cond_5
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    if-eqz v1, :cond_9

    if-ne v1, v4, :cond_6

    .line 588
    :goto_3
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p3}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p3

    .line 138
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_3

    :cond_6
    if-ne v1, v5, :cond_8

    .line 94
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_7

    .line 588
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p3}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 98
    iget-object p3, p0, Ll/ܰ᩵ۧ;->֫:Ll/᩶᩵ۧ;

    invoke-virtual {p3, v0}, Ll/᩶᩵ۧ;->֫(Ll/ᩳ֨֫;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 95
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A style block was found after the first cue."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    if-ne v1, v3, :cond_1

    .line 101
    invoke-static {v0, p1}, Ll/᩺᩵ۧ;->֫(Ll/ᩳ֨֫;Ljava/util/ArrayList;)Ll/ۗ᩵ۧ;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 103
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 107
    :cond_9
    new-instance p1, Ll/ۧ֡ۧ;

    invoke-direct {p1, p2}, Ll/ۧ֡ۧ;-><init>(Ljava/util/ArrayList;)V

    .line 108
    invoke-static {p1, p4, p5}, Ll/ۛۘۧ;->֫(Ll/ܰۘۧ;Ll/᩷ᩴۧ;Ll/᩻ۚ֫;)V

    return-void

    :catch_0
    move-exception p1

    .line 84
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
