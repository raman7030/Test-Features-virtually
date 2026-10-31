.class public Ll/ܿۨ᩵;
.super Ll/ܶ۬᩵;
.source "54FB"


# instance fields
.field public ᩶:Ll/۟ۛ᩵;


# direct methods
.method public constructor <init>(IIJ)V
    .locals 1

    .line 86
    invoke-direct {p0}, Ll/ܶ۬᩵;-><init>()V

    .line 95
    new-instance v0, Ll/۟ۛ᩵;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/۟ۛ᩵;-><init>(IIJ)V

    .line 92
    iput-object v0, p0, Ll/ܿۨ᩵;->᩶:Ll/۟ۛ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Runnable;Ll/᩻ۨ᩵;)V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܿۨ᩵;->᩶:Ll/۟ۛ᩵;

    invoke-virtual {v0, p1, p2}, Ll/۟ۛ᩵;->֫(Ljava/lang/Runnable;Ll/᩻ۨ᩵;)V

    return-void
.end method

.method public final ֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V
    .locals 1

    .line 97
    sget-object p1, Ll/۟ۛ᩵;->۫:Ll/ܶۛ᩵;

    .line 382
    sget-object p1, Ll/ۢۨ᩵;->ܿ:Ll/᩻ۨ᩵;

    iget-object v0, p0, Ll/ܿۨ᩵;->᩶:Ll/۟ۛ᩵;

    invoke-virtual {v0, p2, p1}, Ll/۟ۛ᩵;->֫(Ljava/lang/Runnable;Ll/᩻ۨ᩵;)V

    return-void
.end method
