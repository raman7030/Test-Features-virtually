.class public final Ll/۬ۢ֫;
.super Ljava/lang/Object;
.source "PAOD"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/۟ۢ֫;

.field public final synthetic ᩹:Ll/ܶ۫ۧ;


# direct methods
.method public constructor <init>(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/۬ۢ֫;->᩸:Ll/۟ۢ֫;

    iput-object p2, p0, Ll/۬ۢ֫;->᩹:Ll/ܶ۫ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 67
    sget-object p1, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_0

    .line 68
    iget-object p1, p0, Ll/۬ۢ֫;->᩸:Ll/۟ۢ֫;

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 69
    iget-object p1, p0, Ll/۬ۢ֫;->᩹:Ll/ܶ۫ۧ;

    invoke-virtual {p1}, Ll/ܶ۫ۧ;->ۧ()V

    :cond_0
    return-void
.end method
