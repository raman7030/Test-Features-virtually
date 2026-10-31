.class public final Ll/᩸۠ۡ;
.super Ljava/lang/Object;
.source "Z6VB"


# instance fields
.field public final synthetic ֫:Ll/᩹۠ۡ;


# direct methods
.method public constructor <init>(Ll/᩹۠ۡ;)V
    .locals 0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۠ۡ;->֫:Ll/᩹۠ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺۠ۡ;)V
    .locals 1

    .line 127
    new-instance v0, Ll/ܶ۠ۡ;

    invoke-direct {v0, p0, p1}, Ll/ܶ۠ۡ;-><init>(Ll/᩸۠ۡ;Ll/᩺۠ۡ;)V

    iget-object p1, p0, Ll/᩸۠ۡ;->֫:Ll/᩹۠ۡ;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
