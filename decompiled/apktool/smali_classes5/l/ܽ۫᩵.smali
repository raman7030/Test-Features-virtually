.class public final Ll/ܽ۫᩵;
.super Ll/᩻ۛ᩵;
.source "TAXM"


# instance fields
.field public final synthetic ܿ:Ll/ᩳ۫᩵;

.field public final synthetic ᩳ:Ll/᩶۬᩵;


# direct methods
.method public constructor <init>(Ll/۟۬᩵;Ll/ᩳ۫᩵;Ll/᩶۬᩵;)V
    .locals 0

    .line 2
    iput-object p2, p0, Ll/ܽ۫᩵;->ܿ:Ll/ᩳ۫᩵;

    .line 4
    iput-object p3, p0, Ll/ܽ۫᩵;->ᩳ:Ll/᩶۬᩵;

    .line 91
    invoke-direct {p0, p1}, Ll/᩻ۛ᩵;-><init>(Ll/᩷ۛ᩵;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;)Ll/ܶۛ᩵;
    .locals 1

    .line 91
    check-cast p1, Ll/᩷ۛ᩵;

    .line 524
    iget-object p1, p0, Ll/ܽ۫᩵;->ܿ:Ll/ᩳ۫᩵;

    invoke-virtual {p1}, Ll/ᩳ۫᩵;->ۢ()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll/ܽ۫᩵;->ᩳ:Ll/᩶۬᩵;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {}, Ll/ܳۛ᩵;->֫()Ll/ܶۛ᩵;

    move-result-object p1

    return-object p1
.end method
