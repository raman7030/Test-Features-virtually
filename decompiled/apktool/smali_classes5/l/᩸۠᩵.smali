.class public final synthetic Ll/᩸۠᩵;
.super Ljava/lang/Object;
.source "T9A4"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/᩹۠᩵;


# direct methods
.method public synthetic constructor <init>(Ll/᩹۠᩵;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸۠᩵;->᩸:Ll/᩹۠᩵;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩸۠᩵;->᩸:Ll/᩹۠᩵;

    if-ne p1, v0, :cond_0

    const-string p1, "(this Collection)"

    return-object p1

    .line 27
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
