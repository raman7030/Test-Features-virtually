.class public final Ll/ᩳܳܳ;
.super Ljava/lang/Object;
.source "27BS"


# static fields
.field public static final ܳ:Ljava/util/regex/Pattern;

.field public static final ܿ:Ljava/util/regex/Pattern;

.field public static final ᩻:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)"

    const/4 v1, 0x2

    .line 535
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩳܳܳ;->᩻:Ljava/util/regex/Pattern;

    const-string v0, "[ |\t]*(charset)[ |\t]*=[ |\t]*[\'|\"]?([^\"^\'^;^,]*)[\'|\"]?"

    .line 539
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩳܳܳ;->ܳ:Ljava/util/regex/Pattern;

    const-string v0, "[ |\t]*(boundary)[ |\t]*=[ |\t]*[\'|\"]?([^\"^\'^;^,]*)[\'|\"]?"

    .line 543
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩳܳܳ;->ܿ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 554
    iput-object p1, p0, Ll/ᩳܳܳ;->ܽ:Ljava/lang/String;

    const/4 v0, 0x2

    const-string v1, ""

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    .line 570
    sget-object v3, Ll/ᩳܳܳ;->᩻:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 571
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 556
    :cond_0
    iput-object v1, p0, Ll/ᩳܳܳ;->ۧ:Ljava/lang/String;

    .line 557
    sget-object v1, Ll/ᩳܳܳ;->ܳ:Ljava/util/regex/Pattern;

    .line 570
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 571
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 557
    :goto_0
    iput-object v1, p0, Ll/ᩳܳܳ;->ᩳ:Ljava/lang/String;

    goto :goto_1

    .line 559
    :cond_2
    iput-object v1, p0, Ll/ᩳܳܳ;->ۧ:Ljava/lang/String;

    const-string v1, "UTF-8"

    .line 560
    iput-object v1, p0, Ll/ᩳܳܳ;->ᩳ:Ljava/lang/String;

    :goto_1
    const-string v1, "multipart/form-data"

    .line 562
    iget-object v3, p0, Ll/ᩳܳܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 563
    sget-object v1, Ll/ᩳܳܳ;->ܿ:Ljava/util/regex/Pattern;

    .line 570
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 571
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 563
    :cond_3
    iput-object v2, p0, Ll/ᩳܳܳ;->֫:Ljava/lang/String;

    return-void

    .line 565
    :cond_4
    iput-object v2, p0, Ll/ᩳܳܳ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 591
    iget-object v0, p0, Ll/ᩳܳܳ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 579
    iget-object v0, p0, Ll/ᩳܳܳ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ll/ᩳܳܳ;
    .locals 4

    .line 599
    iget-object v0, p0, Ll/ᩳܳܳ;->ᩳ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 600
    new-instance v0, Ll/ᩳܳܳ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩳܳܳ;->ܽ:Ljava/lang/String;

    const-string v3, "; charset=UTF-8"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 600
    invoke-direct {v0, v1}, Ll/ᩳܳܳ;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 575
    iget-object v0, p0, Ll/ᩳܳܳ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    const-string v0, "multipart/form-data"

    .line 595
    iget-object v1, p0, Ll/ᩳܳܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 583
    iget-object v0, p0, Ll/ᩳܳܳ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "UTF-8"

    return-object v0
.end method
