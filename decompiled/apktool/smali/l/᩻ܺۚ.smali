.class public final Ll/᩻ܺۚ;
.super Ll/ܳܿ֡;
.source "E5I8"


# instance fields
.field public final ۫:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ll/ܳܿ֡;-><init>()V

    .line 15
    iput-object p3, p0, Ll/᩻ܺۚ;->۫:Ljava/lang/String;

    .line 16
    iput p1, p0, Ll/ܳܿ֡;->ۙ:I

    .line 17
    iput p2, p0, Ll/ܳܿ֡;->᩹:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ܳܿ֡;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ll/ܳܿ֡;-><init>()V

    .line 9
    iput-object p1, p0, Ll/᩻ܺۚ;->۫:Ljava/lang/String;

    .line 10
    iget p1, p2, Ll/ܳܿ֡;->ۙ:I

    iput p1, p0, Ll/ܳܿ֡;->ۙ:I

    .line 11
    iget p1, p2, Ll/ܳܿ֡;->᩹:I

    iput p1, p0, Ll/ܳܿ֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/᩻ܺۚ;->۫:Ljava/lang/String;

    return-object v0
.end method
