.class public final Ll/ۘۤ;
.super Ljava/lang/Object;
.source "S2ZO"


# static fields
.field public static final ۜ:Ljava/lang/String;

.field public static final ܳ:Ll/ۘۤ;

.field public static final ܿ:Ll/ۘۤ;

.field public static final synthetic ᩳ:I

.field public static final ᩷:Ljava/lang/String;

.field public static final ᩻:Ll/ܶۤ;


# instance fields
.field public final ֫:Ll/ܶۤ;

.field public final ۧ:I

.field public final ܽ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 84
    sget-object v0, Ll/ۗۤ;->֫:Ll/ܶۤ;

    sput-object v0, Ll/ۘۤ;->᩻:Ll/ܶۤ;

    const/16 v1, 0x200e

    .line 114
    invoke-static {v1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Ll/ۘۤ;->ۜ:Ljava/lang/String;

    const/16 v1, 0x200f

    .line 119
    invoke-static {v1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Ll/ۘۤ;->᩷:Ljava/lang/String;

    .line 217
    new-instance v1, Ll/ۘۤ;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3, v0}, Ll/ۘۤ;-><init>(ZILl/ܶۤ;)V

    sput-object v1, Ll/ۘۤ;->ܿ:Ll/ۘۤ;

    .line 222
    new-instance v1, Ll/ۘۤ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v3, v0}, Ll/ۘۤ;-><init>(ZILl/ܶۤ;)V

    sput-object v1, Ll/ۘۤ;->ܳ:Ll/ۘۤ;

    return-void
.end method

.method public constructor <init>(ZILl/ܶۤ;)V
    .locals 0

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    iput-boolean p1, p0, Ll/ۘۤ;->ܽ:Z

    .line 264
    iput p2, p0, Ll/ۘۤ;->ۧ:I

    .line 265
    iput-object p3, p0, Ll/ۘۤ;->֫:Ll/ܶۤ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 506
    iget-object v0, p0, Ll/ۘۤ;->֫:Ll/ܶۤ;

    invoke-virtual {p0, p1, v0}, Ll/ۘۤ;->֫(Ljava/lang/CharSequence;Ll/ܶۤ;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/CharSequence;Ll/ܶۤ;)Landroid/text/SpannableStringBuilder;
    .locals 9

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 412
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    check-cast p2, Ll/᩶ۤ;

    invoke-virtual {p2, v0, p1}, Ll/᩶ۤ;->֫(ILjava/lang/CharSequence;)Z

    move-result p2

    .line 413
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 280
    iget v1, p0, Ll/ۘۤ;->ۧ:I

    and-int/lit8 v1, v1, 0x2

    const-string v2, ""

    sget-object v3, Ll/ۘۤ;->᩷:Ljava/lang/String;

    const/4 v4, -0x1

    sget-object v5, Ll/ۘۤ;->ۜ:Ljava/lang/String;

    const/4 v6, 0x1

    iget-boolean v7, p0, Ll/ۘۤ;->ܽ:Z

    if-eqz v1, :cond_6

    if-eqz p2, :cond_1

    .line 416
    sget-object v1, Ll/ۗۤ;->ᩳ:Ll/ܶۤ;

    goto :goto_0

    :cond_1
    sget-object v1, Ll/ۗۤ;->ܽ:Ll/ܶۤ;

    .line 328
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v8

    check-cast v1, Ll/᩶ۤ;

    invoke-virtual {v1, v8, p1}, Ll/᩶ۤ;->֫(ILjava/lang/CharSequence;)Z

    move-result v1

    if-nez v7, :cond_3

    if-nez v1, :cond_2

    .line 558
    new-instance v8, Ll/ۖۤ;

    invoke-direct {v8, p1}, Ll/ۖۤ;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v8}, Ll/ۖۤ;->ۧ()I

    move-result v8

    if-ne v8, v6, :cond_3

    :cond_2
    move-object v1, v5

    goto :goto_1

    :cond_3
    if-eqz v7, :cond_5

    if-eqz v1, :cond_4

    new-instance v1, Ll/ۖۤ;

    invoke-direct {v1, p1}, Ll/ۖۤ;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Ll/ۖۤ;->ۧ()I

    move-result v1

    if-ne v1, v4, :cond_5

    :cond_4
    move-object v1, v3

    goto :goto_1

    :cond_5
    move-object v1, v2

    .line 415
    :goto_1
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_6
    if-eq p2, v7, :cond_8

    if-eqz p2, :cond_7

    const/16 v1, 0x202b

    goto :goto_2

    :cond_7
    const/16 v1, 0x202a

    .line 419
    :goto_2
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 420
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const/16 v1, 0x202c

    .line 421
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    goto :goto_3

    .line 423
    :cond_8
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :goto_3
    if-eqz p2, :cond_9

    .line 427
    sget-object p2, Ll/ۗۤ;->ᩳ:Ll/ܶۤ;

    goto :goto_4

    :cond_9
    sget-object p2, Ll/ۗۤ;->ܽ:Ll/ܶۤ;

    .line 300
    :goto_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    check-cast p2, Ll/᩶ۤ;

    invoke-virtual {p2, v1, p1}, Ll/᩶ۤ;->֫(ILjava/lang/CharSequence;)Z

    move-result p2

    if-nez v7, :cond_b

    if-nez p2, :cond_a

    .line 541
    new-instance v1, Ll/ۖۤ;

    invoke-direct {v1, p1}, Ll/ۖۤ;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Ll/ۖۤ;->ܽ()I

    move-result v1

    if-ne v1, v6, :cond_b

    :cond_a
    move-object v2, v5

    goto :goto_5

    :cond_b
    if-eqz v7, :cond_d

    if-eqz p2, :cond_c

    new-instance p2, Ll/ۖۤ;

    invoke-direct {p2, p1}, Ll/ۖۤ;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Ll/ۖۤ;->ܽ()I

    move-result p1

    if-ne p1, v4, :cond_d

    :cond_c
    move-object v2, v3

    .line 426
    :cond_d
    :goto_5
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 392
    :cond_0
    iget-object v0, p0, Ll/ۘۤ;->֫:Ll/ܶۤ;

    invoke-virtual {p0, p1, v0}, Ll/ۘۤ;->֫(Ljava/lang/CharSequence;Ll/ܶۤ;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
