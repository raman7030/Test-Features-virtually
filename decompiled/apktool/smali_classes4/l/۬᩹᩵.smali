.class public abstract Ll/۬᩹᩵;
.super Ljava/lang/Object;
.source "Z1DC"

# interfaces
.implements Ll/۫᩶᩵;
.implements Ljava/io/Serializable;


# static fields
.field public static final ۫:Ljava/lang/Object;


# instance fields
.field public transient ۗ:Ll/۫᩶᩵;

.field public final ۙ:Ljava/lang/Object;

.field public final ۬:Ljava/lang/String;

.field public final ᩶:Ljava/lang/Class;

.field public final ᩸:Z

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    invoke-static {}, Ll/ۗ᩹᩵;->֫()Ll/ۗ᩹᩵;

    move-result-object v0

    sput-object v0, Ll/۬᩹᩵;->۫:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Ll/۬᩹᩵;->ۙ:Ljava/lang/Object;

    .line 71
    iput-object p2, p0, Ll/۬᩹᩵;->᩶:Ljava/lang/Class;

    .line 72
    iput-object p3, p0, Ll/۬᩹᩵;->᩹:Ljava/lang/String;

    .line 73
    iput-object p4, p0, Ll/۬᩹᩵;->۬:Ljava/lang/String;

    .line 74
    iput-boolean p5, p0, Ll/۬᩹᩵;->᩸:Z

    return-void
.end method


# virtual methods
.method public ۧ()Ll/۫᩶᩵;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/۬᩹᩵;->ۗ:Ll/۫᩶᩵;

    if-nez v0, :cond_0

    .line 88
    invoke-virtual {p0}, Ll/۬᩹᩵;->ܽ()Ll/۫᩶᩵;

    move-result-object v0

    .line 89
    iput-object v0, p0, Ll/۬᩹᩵;->ۗ:Ll/۫᩶᩵;

    :cond_0
    return-object v0
.end method

.method public abstract ܽ()Ll/۫᩶᩵;
.end method

.method public final ܿ()Ll/۫᩹᩵;
    .locals 2

    .line 111
    iget-object v0, p0, Ll/۬᩹᩵;->᩶:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-boolean v1, p0, Ll/۬᩹᩵;->᩸:Z

    if-eqz v1, :cond_1

    .line 112
    invoke-static {v0}, Ll/ۜ᩶᩵;->ۧ(Ljava/lang/Class;)Ll/ᩳ᩶᩵;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {v0}, Ll/ۜ᩶᩵;->֫(Ljava/lang/Class;)Ll/ۛ᩹᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/۬᩹᩵;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Ll/۬᩹᩵;->۬:Ljava/lang/String;

    return-object v0
.end method
