.class public final synthetic Ll/ۗ֫֨;
.super Ljava/lang/Object;
.source "T7EH"

# interfaces
.implements Ll/ۛ֫֨;


# instance fields
.field public final synthetic ֫:Ll/ۨ֫֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ֫֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ֫֨;->֫:Ll/ۨ֫֨;

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 3

    .line 80
    iget-object v0, p0, Ll/ۗ֫֨;->֫:Ll/ۨ֫֨;

    iget-object v1, v0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "\"???\""

    :goto_0
    const-string v2, ";"

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void
.end method
