.class public final Ll/ۧܳ᩵;
.super Ll/ۖܳ᩵;
.source "N673"


# instance fields
.field public final c:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۚ۟ᩴ;[Ljava/lang/Object;)V
    .locals 0

    .line 2084
    invoke-direct {p0, p1}, Ll/ۖܳ᩵;-><init>(Ll/ۚ۟ᩴ;)V

    .line 2085
    iput-object p2, p0, Ll/ۧܳ᩵;->c:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ۧܳ᩵;Ll/ۚ۟ᩴ;I)V
    .locals 0

    .line 2089
    invoke-direct {p0, p1, p2, p3}, Ll/ۖܳ᩵;-><init>(Ll/ۖܳ᩵;Ll/ۚ۟ᩴ;I)V

    .line 2090
    iget-object p1, p1, Ll/ۧܳ᩵;->c:[Ljava/lang/Object;

    iput-object p1, p0, Ll/ۧܳ᩵;->c:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 2100
    iget-object v0, p0, Ll/ۖܳ᩵;->a:Ll/ۚ۟ᩴ;

    iget-object v1, p0, Ll/ۧܳ᩵;->c:[Ljava/lang/Object;

    iget v2, p0, Ll/ۖܳ᩵;->b:I

    invoke-interface {v0, v1, v2}, Ll/ۚ۟ᩴ;->k([Ljava/lang/Object;I)V

    return-void
.end method

.method public final b(II)Ll/ۖܳ᩵;
    .locals 2

    .line 2095
    new-instance v0, Ll/ۧܳ᩵;

    iget-object v1, p0, Ll/ۖܳ᩵;->a:Ll/ۚ۟ᩴ;

    invoke-interface {v1, p1}, Ll/ۚ۟ᩴ;->a(I)Ll/ۚ۟ᩴ;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, Ll/ۧܳ᩵;-><init>(Ll/ۧܳ᩵;Ll/ۚ۟ᩴ;I)V

    return-object v0
.end method
