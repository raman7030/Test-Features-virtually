.class public final synthetic Ll/ۘۘ֨;
.super Ljava/lang/Object;
.source "P7M1"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/֡֡֨;

.field public final synthetic ᩹:Ll/ۤܶ۠;


# direct methods
.method public synthetic constructor <init>(Ll/֡֡֨;Ll/ۤܶ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۘ֨;->᩸:Ll/֡֡֨;

    iput-object p2, p0, Ll/ۘۘ֨;->᩹:Ll/ۤܶ۠;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 422
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "msym="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۘۘ֨;->᩸:Ll/֡֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; flatName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘۘ֨;->᩹:Ll/ۤܶ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
