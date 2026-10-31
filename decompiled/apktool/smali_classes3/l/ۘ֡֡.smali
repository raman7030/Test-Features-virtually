.class public final Ll/ۘ֡֡;
.super Ljava/lang/Object;
.source "U7TB"

# interfaces
.implements Ll/ܿ֨֡;


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^[!\"#$%&\'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]"

    .line 17
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۘ֡֡;->֫:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺᩵֡;)Ll/ۙ֡֡;
    .locals 3

    .line 21
    invoke-virtual {p1}, Ll/᩺᩵֡;->֫()Ll/ۢ֨֡;

    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ll/ۢ֨֡;->ۧ()V

    .line 25
    invoke-virtual {p1}, Ll/ۢ֨֡;->ܽ()C

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 27
    invoke-virtual {p1}, Ll/ۢ֨֡;->ۧ()V

    .line 28
    new-instance v0, Ll/᩻ۚ֡;

    invoke-direct {v0}, Ll/᩻ۚ֡;-><init>()V

    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object p1

    .line 21
    new-instance v1, Ll/ۙ֡֡;

    invoke-direct {v1, v0, p1}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object v1

    .line 29
    :cond_0
    sget-object v1, Ll/ۘ֡֡;->֫:Ljava/util/regex/Pattern;

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 30
    invoke-virtual {p1}, Ll/ۢ֨֡;->ۧ()V

    .line 31
    new-instance v1, Ll/۬ۚ֡;

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/۬ۚ֡;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object p1

    .line 21
    new-instance v0, Ll/ۙ֡֡;

    invoke-direct {v0, v1, p1}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object v0

    .line 33
    :cond_1
    new-instance v0, Ll/۬ۚ֡;

    const-string v1, "\\"

    invoke-direct {v0, v1}, Ll/۬ۚ֡;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۢ֨֡;->ܳ()Ll/᩷֨֡;

    move-result-object p1

    .line 21
    new-instance v1, Ll/ۙ֡֡;

    invoke-direct {v1, v0, p1}, Ll/ۙ֡֡;-><init>(Ll/֡ۚ֡;Ll/᩷֨֡;)V

    return-object v1
.end method
