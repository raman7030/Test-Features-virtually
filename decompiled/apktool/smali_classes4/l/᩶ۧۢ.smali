.class public final synthetic Ll/᩶ۧۢ;
.super Ljava/lang/Object;
.source "P67V"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/util/Set;

.field public final synthetic ᩶:Ll/ܰ֫ۢ;

.field public final synthetic ᩸:Ll/ۡۛۡ;

.field public final synthetic ᩹:Ll/᩵ۛۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۛۡ;Ll/᩵ۛۡ;Ll/ܰ֫ۢ;Ljava/util/Set;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۧۢ;->᩸:Ll/ۡۛۡ;

    iput-object p2, p0, Ll/᩶ۧۢ;->᩹:Ll/᩵ۛۡ;

    iput-object p3, p0, Ll/᩶ۧۢ;->᩶:Ll/ܰ֫ۢ;

    iput-object p4, p0, Ll/᩶ۧۢ;->ۙ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/᩶ۧۢ;->᩶:Ll/ܰ֫ۢ;

    iget-object v1, p0, Ll/᩶ۧۢ;->ۙ:Ljava/util/Set;

    iget-object v2, p0, Ll/᩶ۧۢ;->᩸:Ll/ۡۛۡ;

    iget-object v3, p0, Ll/᩶ۧۢ;->᩹:Ll/᩵ۛۡ;

    invoke-static {v2, v3, v0, v1}, Ll/۫ۧۢ;->֫(Ll/ۡۛۡ;Ll/᩵ۛۡ;Ll/ܰ֫ۢ;Ljava/util/Set;)V

    return-void
.end method
