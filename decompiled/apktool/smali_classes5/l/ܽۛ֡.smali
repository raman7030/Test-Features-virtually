.class public final Ll/ܽۛ֡;
.super Ll/ܳ۬֡;
.source "R4LF"


# instance fields
.field public final ۙ:Ll/ۤܽۚ;

.field public final ᩶:I

.field public final ᩹:Ll/۬ۛ֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ܽۛ֡;->᩹:Ll/۬ۛ֡;

    .line 49
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result v0

    iput v0, p0, Ll/ܽۛ֡;->᩶:I

    .line 50
    invoke-static {p1, p2}, Ll/ۤ᩵ۚ;->֫(Ll/۬ۛ֡;Ll/ᩴۨ֡;)Ll/ۤܽۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۛ֡;->ۙ:Ll/ۤܽۚ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 2

    .line 56
    iget-object v0, p0, Ll/ܽۛ֡;->᩹:Ll/۬ۛ֡;

    iget v1, p0, Ll/ܽۛ֡;->᩶:I

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ll/ۤܽۚ;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܽۛ֡;->ۙ:Ll/ۤܽۚ;

    return-object v0
.end method
