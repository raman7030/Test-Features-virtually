.class public final synthetic Ll/֨ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩶ۨᩳ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۨᩳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۛᩳ;->᩸:Ll/᩶ۨᩳ;

    iput-object p2, p0, Ll/֨ۛᩳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    sget-object v0, Ll/۫ۨᩳ;->᩻ܿ:Landroid/text/method/TextKeyListener;

    .line 7142
    iget-object v0, p0, Ll/֨ۛᩳ;->᩸:Ll/᩶ۨᩳ;

    iget-object v0, v0, Ll/᩶ۨᩳ;->ۧ:Ll/ۗ᩻᩵;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    iget-object v2, p0, Ll/֨ۛᩳ;->᩹:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
