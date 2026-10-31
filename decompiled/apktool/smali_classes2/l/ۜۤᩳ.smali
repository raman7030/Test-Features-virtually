.class public final synthetic Ll/ۜۤᩳ;
.super Ljava/lang/Object;
.source "V8VP"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ۘۤᩳ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ۘۤᩳ;ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۤᩳ;->᩸:Ll/ۘۤᩳ;

    iput-boolean p2, p0, Ll/ۜۤᩳ;->᩹:Z

    iput-boolean p3, p0, Ll/ۜۤᩳ;->᩶:Z

    iput-object p4, p0, Ll/ۜۤᩳ;->ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۜۤᩳ;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-object v0, p0, Ll/ۜۤᩳ;->ۙ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۜۤᩳ;->ۗ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۜۤᩳ;->᩸:Ll/ۘۤᩳ;

    iget-boolean v3, p0, Ll/ۜۤᩳ;->᩹:Z

    iget-boolean v4, p0, Ll/ۜۤᩳ;->᩶:Z

    invoke-static {v2, v3, v4, v0, v1}, Ll/ۘۤᩳ;->֫(Ll/ۘۤᩳ;ZZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
