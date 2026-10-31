.class public Ll/ۙܿ᩵;
.super Ll/ۖܳ᩵;
.source "N673"


# instance fields
.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۙܿ᩵;Ll/᩻۟ᩴ;I)V
    .locals 0

    .line 2117
    invoke-direct {p0, p1, p2, p3}, Ll/ۖܳ᩵;-><init>(Ll/ۖܳ᩵;Ll/ۚ۟ᩴ;I)V

    .line 2118
    iget-object p1, p1, Ll/ۙܿ᩵;->c:Ljava/lang/Object;

    iput-object p1, p0, Ll/ۙܿ᩵;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/᩻۟ᩴ;Ljava/lang/Object;)V
    .locals 0

    .line 2112
    invoke-direct {p0, p1}, Ll/ۖܳ᩵;-><init>(Ll/ۚ۟ᩴ;)V

    .line 2113
    iput-object p2, p0, Ll/ۙܿ᩵;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 2128
    iget-object v0, p0, Ll/ۖܳ᩵;->a:Ll/ۚ۟ᩴ;

    check-cast v0, Ll/᩻۟ᩴ;

    iget-object v1, p0, Ll/ۙܿ᩵;->c:Ljava/lang/Object;

    iget v2, p0, Ll/ۖܳ᩵;->b:I

    invoke-interface {v0, v2, v1}, Ll/᩻۟ᩴ;->e(ILjava/lang/Object;)V

    return-void
.end method

.method public final b(II)Ll/ۖܳ᩵;
    .locals 2

    .line 2123
    new-instance v0, Ll/ۙܿ᩵;

    iget-object v1, p0, Ll/ۖܳ᩵;->a:Ll/ۚ۟ᩴ;

    check-cast v1, Ll/᩻۟ᩴ;

    invoke-interface {v1, p1}, Ll/᩻۟ᩴ;->a(I)Ll/᩻۟ᩴ;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, Ll/ۙܿ᩵;-><init>(Ll/ۙܿ᩵;Ll/᩻۟ᩴ;I)V

    return-object v0
.end method
