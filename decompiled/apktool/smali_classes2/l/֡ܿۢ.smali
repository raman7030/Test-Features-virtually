.class public final synthetic Ll/֡ܿۢ;
.super Ljava/lang/Object;
.source "SBMC"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩶ܿۢ;

.field public final synthetic ᩹:Ll/ܳۧۢ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ܿۢ;Ll/ܳۧۢ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܿۢ;->᩸:Ll/᩶ܿۢ;

    iput-object p2, p0, Ll/֡ܿۢ;->᩹:Ll/ܳۧۢ;

    iput p3, p0, Ll/֡ܿۢ;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/֡ܿۢ;->᩹:Ll/ܳۧۢ;

    iget v1, p0, Ll/֡ܿۢ;->᩶:I

    iget-object v2, p0, Ll/֡ܿۢ;->᩸:Ll/᩶ܿۢ;

    invoke-static {v2, v0, v1}, Ll/᩶ܿۢ;->֫(Ll/᩶ܿۢ;Ll/ܳۧۢ;I)V

    return-void
.end method
