.class public final Ll/ܳ۠֨;
.super Ljava/lang/Object;
.source "Z7L9"

# interfaces
.implements Ll/ۜ۠֨;


# static fields
.field public static final ۧ:Ll/ۖܶ۠;


# instance fields
.field public ֫:Ll/ۖܶ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 177
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    sput-object v0, Ll/ܳ۠֨;->ۧ:Ll/ۖܶ۠;

    return-void
.end method

.method public constructor <init>(Ll/ۖܶ۠;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    iput-object p1, p0, Ll/ܳ۠֨;->֫:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ANNOTATIONS [ "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܳ۠֨;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۖܶ۠;
    .locals 1

    .line 189
    iget-object v0, p0, Ll/ܳ۠֨;->֫:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final ֫(Ll/ܳ۠֨;)Ll/ܳ۠֨;
    .locals 2

    .line 194
    iget-object v0, p0, Ll/ܳ۠֨;->֫:Ll/ۖܶ۠;

    sget-object v1, Ll/ܳ۠֨;->ۧ:Ll/ۖܶ۠;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 195
    iget-object p1, p1, Ll/ܳ۠֨;->֫:Ll/ۖܶ۠;

    iput-object p1, p0, Ll/ܳ۠֨;->֫:Ll/ۖܶ۠;

    return-object p0
.end method
