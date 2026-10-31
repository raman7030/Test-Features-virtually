.class public final synthetic Ll/۫֫֨;
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

    iput-object p1, p0, Ll/۫֫֨;->֫:Ll/ۨ֫֨;

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 3

    .line 85
    iget-object v0, p0, Ll/۫֫֨;->֫:Ll/ۨ֫֨;

    iget-object v1, v0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void
.end method
