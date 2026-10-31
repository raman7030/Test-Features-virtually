.class public final Ll/ܿ֫ۢ;
.super Ljava/lang/Object;
.source "Z1GQ"

# interfaces
.implements Ll/۟᩹ᩳ;


# instance fields
.field public final synthetic ۧ:Ll/۠֫ۢ;


# direct methods
.method public constructor <init>(Ll/۠֫ۢ;)V
    .locals 0

    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ֫ۢ;->ۧ:Ll/۠֫ۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 0

    const-string p1, "file"

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 254
    iget-object p1, p0, Ll/ܿ֫ۢ;->ۧ:Ll/۠֫ۢ;

    invoke-static {p1}, Ll/۠֫ۢ;->ܿ(Ll/۠֫ۢ;)Ll/᩵ۨ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ۬᩷;->ᩳ()Ll/ۧ۫᩷;

    move-result-object v0

    invoke-static {p1, v0}, Ll/۠֫ۢ;->֫(Ll/۠֫ۢ;Ll/ۧ۫᩷;)Ll/ۧ۫᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ۫᩷;->᩻()Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method
