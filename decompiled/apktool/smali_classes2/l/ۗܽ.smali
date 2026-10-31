.class public final Ll/ۗܽ;
.super Ljava/lang/Object;
.source "K234"


# static fields
.field public static final ֫:Ll/ۗܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/ۗܽ;

    .line 373
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/ۗܽ;->֫:Ll/ۗܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܺ᩹᩵;Ll/ܺ᩹᩵;Ll/֫᩹᩵;Ll/֫᩹᩵;)Landroid/window/OnBackInvokedCallback;
    .locals 1

    const-string v0, "onBackStarted"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackProgressed"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackInvoked"

    .line 15
    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackCancelled"

    .line 20
    invoke-static {p4, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    new-instance v0, Ll/ۙܽ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ۙܽ;-><init>(Ll/ܺ᩹᩵;Ll/ܺ᩹᩵;Ll/֫᩹᩵;Ll/֫᩹᩵;)V

    return-object v0
.end method
