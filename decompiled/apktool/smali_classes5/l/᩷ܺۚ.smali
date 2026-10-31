.class public final Ll/᩷ܺۚ;
.super Ll/ܳܿ֡;
.source "75MN"


# instance fields
.field public ۫:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Ll/ۨᩳ֡;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Ll/ܳܿ֡;-><init>(Ll/ۨᩳ֡;)V

    .line 43
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܺۚ;->۫:Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(Ll/ۨᩳ֡;Ll/ᩴܿ֡;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ll/ܳܿ֡;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ܳܿ֡;->᩶:Ll/ۨᩳ֡;

    .line 67
    iget-object p1, p2, Ll/ᩴܿ֡;->ܳ:Ll/ۜܿ֡;

    .line 54
    iput-object p1, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    .line 56
    invoke-interface {p1}, Ll/ۜܿ֡;->getLine()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->ۙ:I

    .line 57
    iget-object p1, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-interface {p1}, Ll/ۜܿ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->᩹:I

    .line 58
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܺۚ;->۫:Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(Ll/۬ᩳ֡;Ll/ۜܿ֡;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ll/ܳܿ֡;-><init>()V

    .line 63
    iput-object p1, p0, Ll/ܳܿ֡;->᩶:Ll/ۨᩳ֡;

    .line 64
    iput-object p2, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    .line 65
    move-object p1, p2

    check-cast p1, Ll/ۗᩳ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    invoke-interface {p2}, Ll/ۜܿ֡;->getLine()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->ۙ:I

    .line 67
    invoke-interface {p2}, Ll/ۜܿ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->᩹:I

    .line 68
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܺۚ;->۫:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/᩵ܿ֡;Ljava/lang/Exception;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Ll/ܳܿ֡;-><init>(Ll/ۨᩳ֡;)V

    .line 48
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܺۚ;->۫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩷ܺۚ;->۫:Ljava/lang/String;

    return-object v0
.end method
