.class public final Ll/᩸᩵֡;
.super Ll/ۡ֨֡;
.source "Y90G"


# static fields
.field public static final ܿ:[[Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ll/᩷ۚ֡;

.field public final ۧ:Ljava/util/regex/Pattern;

.field public ܽ:Ll/ܿ᩵֡;

.field public ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const-string v0, "^<(?:script|pre|style|textarea)(?:\\s|>|$)"

    const/4 v1, 0x2

    .line 31
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v2, "</(?:script|pre|style|textarea)>"

    .line 33
    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v2

    new-array v3, v1, [Ljava/util/regex/Pattern;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const-string v2, "^<!--"

    .line 35
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v5, "-->"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    new-array v6, v1, [Ljava/util/regex/Pattern;

    aput-object v2, v6, v4

    aput-object v5, v6, v0

    const-string v2, "^<[?]"

    .line 36
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v5, "\\?>"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    new-array v7, v1, [Ljava/util/regex/Pattern;

    aput-object v2, v7, v4

    aput-object v5, v7, v0

    const-string v2, "^<![A-Z]"

    .line 37
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v5, ">"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    new-array v8, v1, [Ljava/util/regex/Pattern;

    aput-object v2, v8, v4

    aput-object v5, v8, v0

    const-string v2, "^<!\\[CDATA\\["

    .line 38
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v5, "\\]\\]>"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    new-array v9, v1, [Ljava/util/regex/Pattern;

    aput-object v2, v9, v4

    aput-object v5, v9, v0

    const-string v2, "^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)"

    .line 40
    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v2

    new-array v5, v1, [Ljava/util/regex/Pattern;

    aput-object v2, v5, v4

    const/4 v2, 0x0

    aput-object v2, v5, v0

    const-string v10, "^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"\'=<>`\\x00-\\x20]+|\'[^\']*\'|\"[^\"]*\"))?)*+\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$"

    .line 62
    invoke-static {v10, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v10

    new-array v11, v1, [Ljava/util/regex/Pattern;

    aput-object v10, v11, v4

    aput-object v2, v11, v0

    const/16 v10, 0x8

    new-array v10, v10, [[Ljava/util/regex/Pattern;

    new-array v12, v1, [Ljava/util/regex/Pattern;

    aput-object v2, v12, v4

    aput-object v2, v12, v0

    aput-object v12, v10, v4

    aput-object v3, v10, v0

    aput-object v6, v10, v1

    const/4 v0, 0x3

    aput-object v7, v10, v0

    const/4 v0, 0x4

    aput-object v8, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v5, v10, v0

    const/4 v0, 0x7

    aput-object v11, v10, v0

    sput-object v10, Ll/᩸᩵֡;->ܿ:[[Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v0, Ll/᩷ۚ֡;

    invoke-direct {v0}, Ll/᩷ۚ֡;-><init>()V

    iput-object v0, p0, Ll/᩸᩵֡;->֫:Ll/᩷ۚ֡;

    const/4 v0, 0x0

    .line 71
    iput-boolean v0, p0, Ll/᩸᩵֡;->ᩳ:Z

    .line 72
    new-instance v0, Ll/ܿ᩵֡;

    invoke-direct {v0}, Ll/ܿ᩵֡;-><init>()V

    iput-object v0, p0, Ll/᩸᩵֡;->ܽ:Ll/ܿ᩵֡;

    .line 75
    iput-object p1, p0, Ll/᩸᩵֡;->ۧ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static bridge synthetic ֫()[[Ljava/util/regex/Pattern;
    .locals 1

    .line 0
    sget-object v0, Ll/᩸᩵֡;->ܿ:[[Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 1

    .line 85
    iget-boolean v0, p0, Ll/᩸᩵֡;->ᩳ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-interface {p1}, Ll/᩵֨֡;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩸᩵֡;->ۧ:Ljava/util/regex/Pattern;

    if-nez v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 93
    :cond_1
    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result p1

    invoke-static {p1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ֨֡;)V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/᩸᩵֡;->ܽ:Ll/ܿ᩵֡;

    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܿ᩵֡;->֫(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v0, p0, Ll/᩸᩵֡;->ۧ:Ljava/util/regex/Pattern;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 102
    iput-boolean p1, p0, Ll/᩸᩵֡;->ᩳ:Z

    :cond_0
    return-void
.end method

.method public final ۜ()V
    .locals 2

    .line 108
    iget-object v0, p0, Ll/᩸᩵֡;->ܽ:Ll/ܿ᩵֡;

    invoke-virtual {v0}, Ll/ܿ᩵֡;->֫()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸᩵֡;->֫:Ll/᩷ۚ֡;

    invoke-virtual {v1, v0}, Ll/᩷ۚ֡;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 109
    iput-object v0, p0, Ll/᩸᩵֡;->ܽ:Ll/ܿ᩵֡;

    return-void
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/᩸᩵֡;->֫:Ll/᩷ۚ֡;

    return-object v0
.end method
