.class public final synthetic Ll/ᩴۜ᩻;
.super Ljava/lang/Object;
.source "TAHS"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۬ۗܿ;


# direct methods
.method public synthetic constructor <init>(Ll/۬ۗܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۜ᩻;->᩸:Ll/۬ۗܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ᩴۜ᩻;->᩸:Ll/۬ۗܿ;

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
