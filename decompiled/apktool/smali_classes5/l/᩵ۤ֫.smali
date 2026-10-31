.class public final Ll/᩵ۤ֫;
.super Ljava/lang/Object;
.source "68UW"

# interfaces
.implements Ll/۫۫֫;


# instance fields
.field public final synthetic ֫:Ll/۠ۤ֫;


# direct methods
.method public constructor <init>(Ll/۠ۤ֫;)V
    .locals 0

    .line 2226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۤ֫;->֫:Ll/۠ۤ֫;

    return-void
.end method


# virtual methods
.method public final ֫(J)V
    .locals 2

    .line 2285
    iget-object v0, p0, Ll/᩵ۤ֫;->֫:Ll/۠ۤ֫;

    invoke-static {v0}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2286
    invoke-static {v0}, Ll/۠ۤ֫;->ᩳ(Ll/۠ۤ֫;)Ll/᩸۫֫;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/᩸۫֫;->֫(J)V

    :cond_0
    return-void
.end method
